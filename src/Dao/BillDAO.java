package Dao;

import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Helper.ComplaintHelper;
import Model.Bill;
import Model.ComplaintRegister;
import Model.Consumer;




public class BillDAO 
{
	static Scanner scan = new Scanner(System.in);
	
	public static boolean insertBill(Bill team) throws ClassNotFoundException, SQLException{
		String query = "insert into Bill values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(query);
		preparedStatement.setInt(1, team.getBillid());
		preparedStatement.setInt(2, team.getAmount());
		preparedStatement.setInt(3, team.getPaid());
		preparedStatement.setInt(4, team.getDue());
		preparedStatement.setString(5, team.getMonth());
		preparedStatement.setString(6, team.getStatus());
		int records = preparedStatement.executeUpdate();
		if(records>0)
		{
			return true;
		}
		return false;
		
	}
	
	public static boolean insertConsumer(Consumer team) throws ClassNotFoundException, SQLException{
		String query = "insert into BillConsumer values(?,?,?,?)";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(query);
		preparedStatement.setInt(1, team.getConsumerId());
		preparedStatement.setString(2, team.getName());
		preparedStatement.setInt(3, team.getBillId());
		preparedStatement.setString(4, team.getEmail());
		int records = preparedStatement.executeUpdate();
		if(records>0)
		{
			return true;
		}
		return false;
		
	} 
	
	public static ResultSet displayTableByID(int consumerId) throws SQLException, ClassNotFoundException{
		String query = "SELECT BillConsumer.*, Bill.*"
				+ " FROM BillConsumer,Bill where BillConsumer.billID = Bill.billId"
				+ " And BillConsumer.ConsumerId = ? ";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(query);
		preparedStatement.setInt(1, consumerId);
		ResultSet r = preparedStatement.executeQuery();
		ArrayList<Bill> bill = new ArrayList<Bill>();
		return r;
		
//		while(r.next()) {
//			int consumerId1 = r.getInt("ConsumerId");
//	    	int billId = r.getInt("billId");
//	    	int amount = r.getInt("amount");
//	    	int paid = r.getInt("paid");
//	    	int due = r.getInt("due");
//	    	
////	    	Bill obj = new Bill(consumerId1,billId )
//	    	
//	    	
//	    	System.out.println("Consumer Id : " + String.valueOf(consumerId1));
//	    	System.out.println("Bill Number : " + String.valueOf(billId));
//	    	System.out.println("Amount : " + String.valueOf(amount));
//	    	System.out.println("Paid : " + String.valueOf(paid));
//	    	System.out.println("Due : " + String.valueOf(due));
//	    	System.out.println("name : " + String.valueOf(name));
//	    	System.out.println("email : " + String.valueOf(email));
//	    	System.out.println();	
//		}
////		return true;
	    
	}
	
	public static boolean userExists(int cust_id) throws SQLException, ClassNotFoundException
	{
		String q = "select * from customer_jsp where id=?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(q);
		preparedStatement.setInt(1, cust_id);
		ResultSet r = preparedStatement.executeQuery();
		if(r.next())
			return true;
		return false;
	}
	
	public static int getLastId() throws ClassNotFoundException, SQLException
	{
		String q = "select billId from bill order by billId desc fetch first 1 rows only";
		ResultSet r = ComplaintHelper.getConnectionStatement().executeQuery(q);
		int count = 1;
		
		while(r.next())
		{
			count = r.getInt("billId");
			count++;
			return count;
		}
		return count;
	}
	
}

package Dao;
import java.sql.*;
import java.util.ArrayList;

import Helper.ComplaintHelper;
import Model.Customer;

public class CustomerDAO 
{
	public static boolean insert(Customer cust) throws ClassNotFoundException, SQLException {
		boolean isInserted = false;
		String insertStatement = "insert into customer_jsp values(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(insertStatement);
		preparedStatement.setInt(1, cust.getId());
		preparedStatement.setString(2, cust.getFirstname());
		preparedStatement.setString(3, cust.getLastname());
		preparedStatement.setString(4, cust.getEmail());
		preparedStatement.setString(5, cust.getMobileNumber());
		preparedStatement.setString(6, cust.getDOB());
		preparedStatement.setString(7, cust.getPassword());
		int numberOfRecordsEffected = preparedStatement.executeUpdate();
		
		if(numberOfRecordsEffected >=1) {
			isInserted = true;
		}
		
		return isInserted;
	}
	
//	public static boolean insertLogin(Customer cust) throws ClassNotFoundException, SQLException {
//		boolean isInserted = false;
//		String insertStatement = "insert into customer_jsp values(?,?,?,?,?,?,?)";
//		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(insertStatement);
//		preparedStatement.setInt(1, cust.getId());
//		preparedStatement.setString(2, cust.getFirstname());
//		preparedStatement.setString(3, cust.getLastname());
//		preparedStatement.setString(4, cust.getEmail());
//		preparedStatement.setString(5, cust.getMobileNumber());
//		preparedStatement.setString(6, cust.getDOB());
//		preparedStatement.setString(7, cust.getPassword());
//		int numberOfRecordsEffected = preparedStatement.executeUpdate();
//		
//		if(numberOfRecordsEffected >=1) {
//			isInserted = true;
//		}
//		
//		return isInserted;
//	}

	public boolean update (Customer cust, int consumerId) throws ClassNotFoundException, SQLException {
		
//		boolean isUpdated = false;
//		String updateStatement = "update customers set email = ? where consumerId = ?";
//		Connection connection= ComplaintHelper.getConnection();
//		try
//		{
//            
//			try(PreparedStatement preparedStatement = connection.prepareStatement(updateStatement))
//			{
//				connection.setAutoCommit(false);
//	            connection.setTransactionIsolation(connection.TRANSACTION_READ_COMMITTED);
//				preparedStatement.setString(1, cust.getEmail());
//				preparedStatement.setInt(2, cust.getConsumerId());
//			    int numberOfRecordsEffected = preparedStatement.executeUpdate();
//				
//				if(numberOfRecordsEffected >0) {
//					isUpdated = true;
//					connection.commit();
//				}
//				
//			}catch(SQLException e)
//			{
//				e.printStackTrace();
//				connection.rollback();
//			}
//		}catch(SQLException e)
//		{
//			e.printStackTrace();
//		}finally{
//			try
//			{
//				connection.setAutoCommit(true);
//				connection.close();
//			}
//			catch(Exception e){
//				e.printStackTrace();
//			}
//		}
//		
//		return isUpdated;
		return true;
	}

	public boolean delete (int consumerId) throws ClassNotFoundException, SQLException {
		boolean isDeleted = false;
		String deleteStatement = "delete from customers where consumerId = ?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(deleteStatement);
		preparedStatement.setInt(1, consumerId);
	int numberOfRecordsEffected = preparedStatement.executeUpdate();
		
		if(numberOfRecordsEffected >=1) {
			isDeleted = true;
		}
		ComplaintHelper.closePreparedStatement();
		return isDeleted;
		
	}

	public Customer get(int consumerId) throws ClassNotFoundException, SQLException {
		
//		String sql = "select * from customers where consumerId = ?";
//		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(sql);
//		preparedStatement.setInt(1, consumerId);
//		ResultSet rs = preparedStatement.executeQuery();
//		Customer cust = new Customer();
//		if(rs.next())
//		{
//
//			cust.setTitle(rs.getString("title")); 
//			cust.setCustomerName(rs.getString("customerName"));
//			cust.setEmail(rs.getString("email"));
//			cust.setMobileNumber(rs.getString("mobileNumber"));
//			cust.setUserId(rs.getString("userId"));
//			cust.setPassword(rs.getString("password"));
//			cust.setConfirmPassword(rs.getString("confirmPassword"));
//		}
//		ComplaintHelper.closePreparedStatement();
//		rs.close();
//		return cust;
		return null;
	}

	public ArrayList<Customer> get() throws ClassNotFoundException, SQLException{
//		ArrayList<Customer> customers = new ArrayList<Customer>();
//		String sql = "select * from customers";
//		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(sql);
//		
//		ResultSet rs = preparedStatement.executeQuery();
//		while(rs.next()) {
//			int id = rs.getInt("consumerId");
//			int billNo = rs.getInt("billNumber");
//			String title = rs.getString("title");
//			String name =rs.getString("customerName");
//			String email = rs.getString("email");
//			String mobileNo =rs.getString("mobileNumber");
//			String userId = rs.getString("userId");
//			String password =rs.getString("password");
//			String cnfPassword = rs.getString("confirmPassword");
//			
//			Customer cust = new Customer(id,billNo, title, name, email, mobileNo, userId, password, cnfPassword);
//			customers.add(cust);
//			
//		}
//		ComplaintHelper.closePreparedStatement();
//		rs.close();
//		return customers;
		return null;
	}
	

	public ResultSet login(String email, String password) throws ClassNotFoundException, SQLException{
		String sql = "select * from customer_jsp where email = ? and password = ?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet rs = preparedStatement.executeQuery();
		return rs;
	}
}

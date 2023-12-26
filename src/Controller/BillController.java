package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.BillDAO;
import Model.Bill;
import Model.Consumer;


public class BillController 
{
private BillDAO dao;
	
	public BillController()
	{
		this.dao = new BillDAO();
	}
	
	
	public boolean tableBillInsert(Bill data) throws ClassNotFoundException, SQLException{
		return this.dao.insertBill(data);
	}
	
	public boolean tableConsumerInsert(Consumer k) throws ClassNotFoundException, SQLException{
		return this.dao.insertConsumer(k);
	}
	
	public ResultSet displayTableByID( int id) throws ClassNotFoundException, SQLException{
		return this.dao.displayTableByID(id);
	}
	
	public int getLastId() throws ClassNotFoundException, SQLException{
		return this.dao.getLastId();
	}
	public boolean userExists(int id) throws ClassNotFoundException, SQLException
	{
		return this.dao.userExists(id);
	}

}

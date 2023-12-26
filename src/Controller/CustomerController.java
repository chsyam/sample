package Controller;
import java.sql.*;
import java.util.ArrayList;

import Dao.CustomerDAO;
import Model.Customer;

public class CustomerController 
{
	private CustomerDAO custDAO;

	public CustomerController() {
		this.custDAO = new CustomerDAO();
	}
	public boolean insert(Customer cust) throws ClassNotFoundException, SQLException {
		return this.custDAO.insert(cust);
	}
	public boolean update(Customer cust, int consumerId) throws ClassNotFoundException, SQLException {
		return this.custDAO.update(cust, consumerId);
	}
	public boolean delete(int consumerId) throws ClassNotFoundException, SQLException {
		return this.custDAO.delete(consumerId);
	}
	public Customer get(int consumerId) throws ClassNotFoundException, SQLException {
		return this.custDAO.get(consumerId);
	}
	public ArrayList<Customer>get() throws ClassNotFoundException, SQLException{
		return this.custDAO.get();
	}
	public ResultSet login(String consumerId, String password) throws ClassNotFoundException, SQLException{
		return this.custDAO.login(consumerId, password);
	}

}

package Controller;
import java.sql.*;
import java.util.ArrayList;

import Dao.ComplaintDao;
import Model.ComplaintRegister;

public class ComplaintController 
{
	private ComplaintDao complaintDAO;
	public ComplaintController()
	{
		this.complaintDAO = new ComplaintDao();
	}
	
	public boolean register(ComplaintRegister complaint) throws ClassNotFoundException, SQLException
	{
		return this.complaintDAO.register(complaint);
	}
	
	public ArrayList<ComplaintRegister> view(int consumerId) throws ClassNotFoundException, SQLException
	{
		return this.complaintDAO.view(consumerId);
	}
	
	public int getLastId() throws ClassNotFoundException, SQLException{
		return this.complaintDAO.getLastId();
	}
	public boolean insertStatus(int id) throws ClassNotFoundException, SQLException
	{
		return this.complaintDAO.insertStatus(id);
	}
	public String getStatus(int compNo) throws ClassNotFoundException, SQLException 
	{
		return this.complaintDAO.getStatus(compNo);
	}
	public ResultSet getAdminComplaint() throws ClassNotFoundException, SQLException
	{
		return this.complaintDAO.getAdminComplaint();
	}
}


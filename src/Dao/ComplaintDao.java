package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Helper.ComplaintHelper;
import Model.ComplaintRegister;
public class ComplaintDao 
{
	public boolean register(ComplaintRegister complaint) throws ClassNotFoundException, SQLException
	{
		boolean isInserted = false;
		String insertStatement = "insert into complaints values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(insertStatement);
		preparedStatement.setInt(1, complaint.getComplaintId());
		preparedStatement.setString(2, complaint.getComplaintType());
		preparedStatement.setString(3, complaint.getCategory());
		preparedStatement.setString(4, complaint.getLandmark());
		preparedStatement.setInt(5, complaint.getConsumerId());
		preparedStatement.setString(6, complaint.getCustomerName());
		preparedStatement.setString(7, complaint.getProblem());
		preparedStatement.setString(8, complaint.getAddress());
		preparedStatement.setString(9, complaint.getMobileNumber());
		int numberOfRecordsEffected = preparedStatement.executeUpdate();
		if(numberOfRecordsEffected >=1) {
			isInserted = true;
		}
		
		return isInserted;
	}
	public static boolean insertStatus(int id) throws ClassNotFoundException, SQLException
	{
		String q = "update complaintstatus set status=? where complaintid=?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(q);
		preparedStatement.setString(1, "completed");
		preparedStatement.setInt(2,id);
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next())
			return true;
		return false;
	}
	
	
	public  ArrayList<ComplaintRegister> view(int consumerId) throws SQLException, ClassNotFoundException
	{
		ArrayList<ComplaintRegister> complaints = new ArrayList<ComplaintRegister>();
		String sql = "select * from complaints where consumerId=?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(sql);
		preparedStatement.setInt(1, consumerId);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			int cid=rs.getInt("complaintId");
			String type = rs.getString("complaintType");
			String category = rs.getString("category");
			String landmark = rs.getString("landmark");
			int id = rs.getInt("consumerId");
			String name = rs.getString("name");
			String problem = rs.getString("problem");
			String address = rs.getString("address");
			String mobile = rs.getString("mobileNumber");			
			ComplaintRegister complaint = new ComplaintRegister(cid, type, category, landmark, id, name, problem, address, mobile);;
			complaints.add(complaint);	
		}
		rs.close();
		return complaints;
	}
	
	public static int getLastId() throws ClassNotFoundException, SQLException
	{
		String q = "select complaintId from complaints order by complaintId desc fetch first 1 rows only";
		ResultSet r = ComplaintHelper.getConnectionStatement().executeQuery(q);
		int count = 1;
		
		while(r.next())
		{
			count = r.getInt("complaintId");
			count++;
			return count;
		}
		return count;
	}
	public static String getStatus(int compNo) throws SQLException, ClassNotFoundException{
		String q = "select complaints.complaintid, complaintStatus.status from complaints,"
				+ " complaintStatus where complaints.complaintid = complaintStatus.complaintId and"
				+ " complaints.complaintid=?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(q);
		preparedStatement.setInt(1, compNo);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("status"));
			return rs.getString("status");
		}
		return "inprogress";
	}
	public static ResultSet getAdminComplaint() throws ClassNotFoundException, SQLException
	{
		String q = "select * from complaints where status=?";
		PreparedStatement preparedStatement = ComplaintHelper.getConnectionPreparedStatement(q);
		preparedStatement.setString(1, "inprogress");
		ResultSet rs = preparedStatement.executeQuery();
		return rs;
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		getStatus(1);
	}
}

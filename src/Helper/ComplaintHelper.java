package Helper;

import java.sql.*;

import Helper.ComplaintHelper;

public class ComplaintHelper 
{
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		return DriverManager.getConnection("jdbc:derby://localhost:1527/ComplaintDb;create=true");
	}
	
	public static Statement getConnectionStatement() throws ClassNotFoundException, java.sql.SQLException
	{
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/ComplaintDb;create=true");
		ComplaintHelper.statement = connection.createStatement();
		return ComplaintHelper.statement;
	}
	
	public static PreparedStatement getConnectionPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/ComplaintDb;create=true");
		ComplaintHelper.preparedStatement = connection.prepareStatement(sql);
		return ComplaintHelper.preparedStatement;
	}

	public static void closeStatement() throws SQLException {
		ComplaintHelper.statement.close();
		ComplaintHelper.connection.close();
	}

	public static void closePreparedStatement() throws SQLException {
		ComplaintHelper.preparedStatement.close();
		ComplaintHelper.connection.close();
	}
}

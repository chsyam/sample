package ComplaintRegisterationServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.CustomerDAO;

import Helper.ComplaintHelper;
import Model.Customer;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	
	public static boolean isDuplicateEmail(String email) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Get connection from DatabaseConnectionManager
            connection = ComplaintHelper.getConnection();

            // Check if the email exists in the login table
            String sql = "SELECT COUNT(*) FROM login WHERE email = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0; // Return true if the email already exists
            }

            return false;
        } finally {
            // Close resources
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
	
	public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        // Regular expression for basic email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Retrieve form parameters
//            int consumerId = Integer.parseInt(request.getParameter("consumerId"));
//            int billNumber = Integer.parseInt(request.getParameter("billNumber"));
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String dob = request.getParameter("DOB");
            String email = request.getParameter("email");
            String mobileNumber = request.getParameter("mobileNumber");
            String password = request.getParameter("password");

            // Validate email format using regular expressions
//            if (!isValidEmail(email)) {
//                throw new IllegalArgumentException("Invalid email format");
//            }

            // Check if email already exists in the login table
//            try {
//				if (isDuplicateEmail(email)) {
//				    throw new IllegalArgumentException("Email already exists");
//				}
//			} catch (ClassNotFoundException | SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

            // Insert into Customer table
            try
            {
        		Random random = new Random();
        		int id = random.nextInt(1000);
        		HttpSession session = request.getSession(true);
        		session.setAttribute("cid",id );
            	boolean isInserted = CustomerDAO.insert(new Customer( id, firstname, lastname, email, mobileNumber, dob, password));
            	System.out.println(isInserted);
            	if(isInserted)
            	{
//            		CustomerDAO.insertLogin(new Customer(id, firstname, lastname, email, mobileNumber, dob, password));
            		response.sendRedirect("register_sucess.jsp");
            	}
            }
            catch (Exception e) {
				// TODO Auto-generated catch block
            	System.out.println(e);
            	request.getRequestDispatcher("registerError.jsp").forward(request,response);
			}   
        
    }

    // Helper methods for database operations, email validation, etc.
}
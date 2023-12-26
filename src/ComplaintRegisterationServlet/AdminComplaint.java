package ComplaintRegisterationServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.ComplaintController;
import Model.ComplaintRegister;

/**
 * Servlet implementation class AdminComplaint
 */
@WebServlet("/AdminComplaint")
public class AdminComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminComplaint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ComplaintController comp = new ComplaintController();
		PrintWriter out = response.getWriter();
		ArrayList<ComplaintRegister> prt = new  ArrayList<>();
		try {
			ResultSet r = comp.getAdminComplaint();
			if(r.next() == false)
			{
				System.out.println("No Data is present");
			}
			else
			{
				do {
					int complaintid = Integer.parseInt(r.getString("complaintid"));
					String complaintType= r.getString("complainttype");
					String categ = r.getString("category");
					String landmark = r.getString("landmark");
					Integer consid = Integer.parseInt(r.getString("consumerid"));
					String name = r.getString("name");
					String problem = r.getString("problem");
					String address = r.getString("address");
					String mno = r.getString("mobilenumber");
					prt.add(new ComplaintRegister(complaintid,complaintType,categ,landmark, consid, name,
			problem, address, mno));
				} while(r.next());
				
			}
			HttpSession session = request.getSession(true);
			session.setAttribute("arr", prt);
			request.getRequestDispatcher("complaintdashboard.jsp").forward(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

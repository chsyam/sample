package ComplaintRegisterationServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.ComplaintController;
import Dao.ComplaintDao;
import Model.ComplaintRegister;

/**
 * Servlet implementation class ViewCompSer
 */
@WebServlet("/ViewCompSer")
public class ViewCompSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCompSer() {
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
		HttpSession session = request.getSession(true);
		int cust_id = (int) session.getAttribute("cid");//access customer id from login page
		ArrayList<ComplaintRegister> arr=new ArrayList<>();
		try {
			arr = comp.view(cust_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter writer = response.getWriter();
		writer.print(arr.get(0).getAddress());
		ArrayList<String> stat = new ArrayList<>();
		for(ComplaintRegister c:arr)
		{
			try {
				stat.add(comp.getStatus(c.getComplaintId()));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.setAttribute("arrstatus", stat);
		request.setAttribute("arrlist",arr);
		request.getRequestDispatcher("ComplaintView.jsp").forward(request,response);
			//response.sendRedirect("ComplaintView.jsp");
		/*for(ComplaintRegister c : arr)
		{
			int id = c.getComplaintId();
			String prblm = c.getProblem();
			String type = c.getComplaintType();
			request.setAttribute("coid", id);
			request.setAttribute("prb", prblm);
			request.setAttribute("type", type);
			request.getRequestDispatcher("ComplaintView.jsp").forward(request,response);
		}*/
		
	}

}

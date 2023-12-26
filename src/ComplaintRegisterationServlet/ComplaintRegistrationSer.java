package ComplaintRegisterationServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ComplaintController;
import Dao.ComplaintDao;

import Model.ComplaintRegister;

/**
 * Servlet implementation class ComplaintRegistrationSer
 */
@WebServlet("/ComplaintRegistrationSer")
public class ComplaintRegistrationSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintRegistrationSer() {
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
		int coid=0;
		try {
			coid = ComplaintDao.getLastId();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String cat=request.getParameter("categ_select");
		String type=request.getParameter("categ_select");
		String nam=request.getParameter("contact_name");
		System.out.println(request.getParameter("customer_id"));
		int cid = Integer.parseInt(request.getParameter("customer_id"));
		String landmark = request.getParameter("landmark");
		String mno = request.getParameter("mobile_number");
		String prblm = request.getParameter("prob_desc");
		String add = request.getParameter("address");
//		ComplaintController complaint_controller = new ComplaintController();
		ComplaintRegister complaint_details = new ComplaintRegister(coid, type, cat, landmark,cid,nam,
				prblm,add,mno);
		boolean isInserted = false;
		try {
			isInserted = comp.register(complaint_details);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		if(isInserted){
			request.setAttribute("coid", coid);
			request.getRequestDispatcher("ComplaintReg.jsp").forward(request,response);
			//response.sendRedirect("suc.jsp");
		}
		else
			out.print("UnSuccessful");
		
	}

}

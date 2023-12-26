package ComplaintRegisterationServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.BillController;
import Controller.ComplaintController;
import Dao.BillDAO;
import Dao.ComplaintDao;
import Model.Bill;
import Model.ComplaintRegister;
import Model.Consumer;

/**
 * Servlet implementation class AdminBillUpdate
 */
@WebServlet("/AdminBillUpdate")
public class AdminBillUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBillUpdate() {
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
		BillController comp = new BillController();
		int billid=0;
		try {
			billid = BillDAO.getLastId();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		int id = Integer.parseInt(request.getParameter("id"));
		String month =request.getParameter("month");
		int amount=Integer.parseInt(request.getParameter("amount"));
		Bill bill_details = new Bill(billid, amount, 0, amount,month,"unpaid");
		Consumer cons_details = new Consumer(id,"",billid,"");
		boolean isInserted = false;
		boolean isInsCB=false;
		boolean user_exist = false;
		String message="";
		try {
			isInserted = comp.tableBillInsert(bill_details);
			isInsCB = comp.tableConsumerInsert(cons_details);
			user_exist = comp.userExists(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isInserted && isInsCB && user_exist){
			response.sendRedirect("billsuccess.jsp");
			//response.sendRedirect("suc.jsp");
		}
		else
		{
			message="User Doesn't Exist";
			response.sendRedirect("bill_update_success.jsp?message="+URLEncoder.encode(message,"UTF-8"));
		}
		
	}

}

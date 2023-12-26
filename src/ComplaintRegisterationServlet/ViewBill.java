package ComplaintRegisterationServlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.BillController;
import Model.Bill;

/**
 * Servlet implementation class ViewBill
 */
@WebServlet("/ViewBill")
public class ViewBill extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBill() {
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
		ResultSet r = null;
		BillController bill = new BillController();
		HttpSession session = request.getSession(true);
		int loginId = (int) session.getAttribute("cid");
		ArrayList<Bill> arr = new ArrayList<>();
		try {
			 r = bill.displayTableByID(loginId);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(r.next()){
				int billId = r.getInt("billId");
		    	int amount = r.getInt("amount");
		    	int paid = r.getInt("paid");
		    	int due = r.getInt("due");
		    	Bill obj = new Bill(billId,amount,paid,due);
		    	arr.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("billArr", arr);
		request.getRequestDispatcher("view_bill.jsp").forward(request,response);
    	
		
		
	}

}

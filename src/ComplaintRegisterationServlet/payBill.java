package ComplaintRegisterationServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.derby.client.am.ResultSet;

import Controller.BillController;
import Model.Bill;

/**
 * Servlet implementation class payBill
 */
@WebServlet("/payBill")
public class payBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public payBill() {
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
		int id = (int) session.getAttribute("cid");
		try {
			r = (ResultSet) bill.displayTableByID(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(r.next()){
				try {
					if(!r.next()){
						break;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Bill> billData = new ArrayList<Bill>();
		int billId;
		try {
			billId = r.getInt("billId");
	    	int amount = r.getInt("amount");
	    	int paid = r.getInt("paid");
	    	int due = r.getInt("due");
	    	Bill obj = new Bill(billId,amount,paid,due);
	    	billData.add(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		request.setAttribute("PaybillData", billData);
		request.getRequestDispatcher("payment_page.jsp").forward(request,response);
		
		
		
	}

}

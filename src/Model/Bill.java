package Model;

public class Bill 
{
	private int billid;
	private int amount;
	private int paid;
	private int due;
	private String month;
	private String status;
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setDue(int due) {
		this.due = due;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getDue(){
		return due;
	}
	public void setDue(){
		this.due = due;
	}
	
	
	
	public Bill(int billid, int amount, int paid, int due,String month,String status) {
		super();
		this.billid = billid;
		this.amount = amount;
		this.paid = paid;
		this.due = due;
		this.month=month;
		this.status = status;
	}
}

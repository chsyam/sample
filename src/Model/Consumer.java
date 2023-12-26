package Model;

public class Consumer 
{
	private int ConsumerId;
	private String name;
	private int billId;
	private String email;
	public int getConsumerId() {
		return ConsumerId;
	}
	public void setConsumerId(int consumerId) {
		ConsumerId = consumerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		billId = billId;
	}
	
	public Consumer(int consumerId, String name,int billId, String email) {
		super();
		ConsumerId = consumerId;
		this.name = name;
		this.billId=billId;
		this.email = email;
	}
}

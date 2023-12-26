package Model;

public class ComplaintRegister 
{
	private int complaintId;
	private String complaintType;
	private String category;
	private String landmark;
	private int consumerId;
	private String customerName;
	private String problem;
	private String address;
	private String mobileNumber;
	
	public ComplaintRegister(int complaintId, String complaintType, String category, String landmark, int consumerId, String customerName,
			String problem, String address, String mobileNumber) {
		super();
		this.complaintId=complaintId;
		this.complaintType = complaintType;
		this.category = category;
		this.landmark = landmark;
		this.consumerId = consumerId;
		this.customerName = customerName;
		this.problem = problem;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	

	public int getComplaintId() {
		return complaintId;
	}



	public String getComplaintType() {
		return complaintType;
	}



	public String getCategory() {
		return category;
	}



	public String getLandmark() {
		return landmark;
	}



	public int getConsumerId() {
		return consumerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public String getProblem() {
		return problem;
	}



	public String getAddress() {
		return address;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", complaintType=" + complaintType + ", category=" + category
				+ ", landmark=" + landmark + ", consumerId=" + consumerId + ", customerName=" + customerName
				+ ", problem=" + problem + ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
}



	


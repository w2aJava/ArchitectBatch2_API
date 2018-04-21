package architect.batch2.api.POJO;

public class Address {
	
	private String houseNo;
	private String street;
	private String state;
	private int pincode;
	
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + getHouseNo() + ", street=" + getStreet() + ", state=" + getState() + ", pincode=" + getPincode() + "]";
	}
	

}

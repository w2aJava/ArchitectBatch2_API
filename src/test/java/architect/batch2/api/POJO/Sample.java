package architect.batch2.api.POJO;

import java.util.List;

public class Sample {
	
	private String firstname;
	private String lastName;
	private String profession;
	private Address address;
	
	private List<Long> phoneNumbers;
	
	
	
	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Sample [firstname=" + getFirstname() + ", lastName=" + getLastName() + ", Profession=" + getProfession() + ", address="
				+ getAddress() +" , phoneNumbers= "+getPhoneNumbers()+ "]";
	}
	
	
	
	

}

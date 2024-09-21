package in.spring.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pinCode;
	
	public int getHouseNo() {
		return houseNo;
	}
	public String getCity() {
		return city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return " " + houseNo +" ,  " + city + " , " + pinCode;
	}
	
}

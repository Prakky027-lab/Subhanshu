package com.cg.bean;

public class Address {

	private String name;
	private String emailId;
	private String MobileNo;
	private Long MobileNo2;
	private String address;
	private String address2;
	private String city;
	private String state;
	private Integer PinCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public Long getMobileNo2() {
		return MobileNo2;
	}
	public void setMobileNo2(Long mobileNo2) {
		MobileNo2 = mobileNo2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPinCode() {
		return PinCode;
	}
	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}
	public Address(String name, String emailId, String mobileNo, Long mobileNo2, String address, String address2,
			String city, String state, Integer pinCode) {
		super();
		this.name = name;
		this.emailId = emailId;
		MobileNo = mobileNo;
		MobileNo2 = mobileNo2;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		PinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", emailId=" + emailId + ", MobileNo=" + MobileNo + ", MobileNo2=" + MobileNo2
				+ ", address=" + address + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", PinCode=" + PinCode + "]";
	}
}

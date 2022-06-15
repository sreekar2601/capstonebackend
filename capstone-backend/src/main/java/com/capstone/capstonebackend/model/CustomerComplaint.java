package com.capstone.capstonebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customercomplaint")
public class CustomerComplaint {
	
	@Id
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="pincode")
	private int pincode;
	@Column(name="phonenumber")
	private double phonenumber;
	@Column(name="typeofproblem")
	private String typeofproblem;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getTypeofproblem() {
		return typeofproblem;
	}
	public void setTypeofproblem(String typeofproblem) {
		this.typeofproblem = typeofproblem;
	}
	public CustomerComplaint(String name, String address, int pincode, double phonenumber, String typeofproblem) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.phonenumber = phonenumber;
		this.typeofproblem = typeofproblem;
	}
	public CustomerComplaint() {
		
	}
	@Override
	public String toString() {
		return "CustomerComplaint [name=" + name + ", address=" + address + ", pincode=" + pincode + ", phonenumber="
				+ phonenumber + ", typeofproblem=" + typeofproblem + "]";
	}
	

}

package com.cbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Employee {
@ Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
@Column
	String fname;
@Column
    String lname;
@Column
	String dept;
@Column
String address;
@Column
	String email;
@Column
String password;
public Employee( String fname, String lname, String dept, String address, String email, String password) {
	super();
	//this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.dept = dept;
	this.address = address;
	this.email = email;
	this.password = password;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", address=" + address
			+ ", email=" + email + ", password=" + password + "]";
}





}



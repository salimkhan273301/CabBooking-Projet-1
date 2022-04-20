package com.cbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cab {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private	Integer cabid;
private	Integer cabNo;
private	String dname;
private	String dmobile; 
private	String daddress;
private	Integer status;
public Cab(Integer cabid, Integer cabNo, String dname, String dmobile, String daddress, Integer status) {
	super();
	this.cabid = cabid;
	this.cabNo = cabNo;
	this.dname = dname;
	this.dmobile = dmobile;
	this.daddress = daddress;
	this.status = status;
}
public Cab() {
	// TODO Auto-generated constructor stub
}
public Integer getCabid() {
	return cabid;
}
public void setCabid(Integer cabid) {
	this.cabid = cabid;
}
public Integer getCabNo() {
	return cabNo;
}
public void setCabNo(Integer cabNo) {
	this.cabNo = cabNo;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDmobile() {
	return dmobile;
}
public void setDmobile(String dmobile) {
	this.dmobile = dmobile;
}
public String getDaddress() {
	return daddress;
}
public void setDaddress(String daddress) {
	this.daddress = daddress;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cabNo == null) ? 0 : cabNo.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cab other = (Cab) obj;
	if (cabNo == null) {
		if (other.cabNo != null)
			return false;
	} else if (!cabNo.equals(other.cabNo))
		return false;
	return true;
}
@Override
public String toString() {
	return "Cab [cabid=" + cabid + ", cabNo=" + cabNo + ", dname=" + dname + ", dmobile=" + dmobile
			+ ", daddress=" + daddress + ", status=" + status + "]";
}



	
}

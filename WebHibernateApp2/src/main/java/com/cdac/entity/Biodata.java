package com.cdac.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_biodata")
public class Biodata {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Sr_No")
	private int srno;
	
	@Column(name="FullName")
	private String FullName;
	
	@Column(name="MobileNo")
	private String MobileNo;
	
	@Column(name="dateofbirth")
	private LocalDate dateofbirth;

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
}

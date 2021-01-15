package com.example.studb.dto;

import java.util.Date;

public class StudentWithoutDept {

	private int id;
	private String first_name;
	private String last_name;
	private String mobile_number;
	private Date date_of_joining;
	private String dept_name;
	
	
	public StudentWithoutDept() {
	}


	public StudentWithoutDept(int id, String first_name, String last_name, String mobile_number, Date date_of_joining,
			String dept_name) {
		
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.date_of_joining = date_of_joining;
		this.dept_name = dept_name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}


	public Date getDate_of_joining() {
		return date_of_joining;
	}


	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
		
	
}
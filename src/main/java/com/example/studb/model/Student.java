package com.example.studb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int stu_id;
	
	@Column(name="firstname")
	private String first_name;
	
	@Column(name="lastname")
	private String last_name;
	
	@Column(name="dateofjoining")
	private Date date_of_joining;
	
	@Column(name="mobilenumber")
	private String mobile_number;
	
	@Column(name="deptid")
	private int dept_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Department department;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "subject") private StudentSubject stuSubject;
	 */
	public Student() {
	}
	
	
	public Student(int stu_id, String first_name, String last_name, Date date_of_joining, String mobile_number, int dept_id
			) {
		this.stu_id = stu_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_joining = date_of_joining;
		this.mobile_number = mobile_number;
		this.dept_id = dept_id;
	}


	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}


	public String getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getId() {
		return stu_id;
	}

	public void setId(int stu_id) {
		this.stu_id = stu_id;
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

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_joining="
				+ date_of_joining + ", dept_id=" + dept_id + "]";
	}
}
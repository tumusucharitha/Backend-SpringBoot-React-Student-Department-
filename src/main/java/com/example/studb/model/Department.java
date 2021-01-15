package com.example.studb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="hod")
	private String hod;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "department")
	private Student student;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "department") private Lecturer lecturer;
	 */
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "department") private DeptLecturerSubject deptLectSubj;
	 */
	public Department() {

	}
	public Department(int dept_id, String name, String hod) {
		super();
		this.dept_id = dept_id;
		this.name = name;
		this.hod = hod;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + ", hod=" + hod + "]";
	}
}

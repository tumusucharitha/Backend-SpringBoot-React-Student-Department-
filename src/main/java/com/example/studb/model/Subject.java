package com.example.studb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject 
{
	@Id
	@Column(name="id")
	private int sub_id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "subject")
	private Lecturer lecturer;
	
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "department") private DeptLecturerSubject deptLectSubj;
	 */
	public Subject() {
	}
	
	public Subject(int sub_id, String name) {
		super();
		this.sub_id = sub_id;
		this.name = name;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", name=" + name + "]";
	}
}

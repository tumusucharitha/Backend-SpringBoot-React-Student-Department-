package com.example.studb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class StudentSubjectIdentity implements Serializable {

	@NotNull
	@Column(name = "studentId", nullable = false, unique = true)
	private int studentId;
	
	@NotNull
	@Column(name = "subjectId", nullable = false, unique = true)
	private int subjectId;

	
	public StudentSubjectIdentity() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentSubjectIdentity(int studentId, int subjectId) {
		
		this.studentId = studentId;
		this.subjectId = subjectId;
	}

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}	
}

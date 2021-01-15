package com.example.studb.model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import java.io.Serializable;;

@Entity
@Table(name = "student_subjects")
public class StudentSubject
{
	@EmbeddedId
	private StudentSubjectIdentity studentSubjectIdentity;
	
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "id") private Student student;
	 * 
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "id") private Subject subject;
	 */
	 

	public StudentSubject() {
		
	}
	
	public StudentSubject(StudentSubjectIdentity studentSubjectIdentity, Student student, Subject subject) {
		this.studentSubjectIdentity = studentSubjectIdentity;
		/*
		 * this.student = student; this.subject = subject;
		 */
	}

	public int getStudentId() {
		return studentSubjectIdentity.getStudentId();
	}

	public void setStudentId(int studentId) {
		this.studentSubjectIdentity.setStudentId(studentId);
	}

	public int getSubjectId() {
		return studentSubjectIdentity.getSubjectId();
	}

	public void setSubjectId(int subjectId) {
		this.studentSubjectIdentity.setSubjectId(subjectId);
	}	
	
	
}

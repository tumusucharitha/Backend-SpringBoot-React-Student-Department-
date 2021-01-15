/*
 * package com.example.studb.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToOne; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="dept_lecturer_subject") public class DeptLecturerSubject {
 * 
 * @Id
 * 
 * @Column(name="dept_id") private int dept_id;
 * 
 * @Id
 * 
 * @Column(name="lecturer_id") private int lecturer_id;
 * 
 * @Id
 * 
 * @Column(name="subject_id") private int subject_id;
 * 
 * @OneToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "id") private Department department;
 * 
 * @OneToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "id") private Lecturer lecturer;
 * 
 * @OneToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "id") private Subject subject;
 * 
 * public int getDept_id() { return dept_id; }
 * 
 * public void setDept_id(int dept_id) { this.dept_id = dept_id; }
 * 
 * public int getLecturer_id() { return lecturer_id; }
 * 
 * public void setLecturer_id(int lecturer_id) { this.lecturer_id = lecturer_id;
 * }
 * 
 * public int getSubject_id() { return subject_id; }
 * 
 * public void setSubject_id(int subject_id) { this.subject_id = subject_id; } }
 */
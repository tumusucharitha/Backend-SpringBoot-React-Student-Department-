package com.example.studb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.dto.StudentWithoutDept;
import com.example.studb.model.Department;
import com.example.studb.model.Student;
import com.example.studb.repository.DepartmentRepository;
import com.example.studb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	public Optional<Student> getStudentById(int stuId) {
		return studentRepo.findById(stuId);
	}
	
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepo.findAll();
	}

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	public void deleteStudent(int stu_id) {
		studentRepo.deleteById(stu_id);
	}

	public Student updateStudent(Student student, int stu_id) {
		return studentRepo.save(student);
	}
	
	
	
	  public List<StudentWithoutDept> getStudentByDeptName() { 
		  return  studentRepo.getStudentByDeptName(); 
		  }
	 
}

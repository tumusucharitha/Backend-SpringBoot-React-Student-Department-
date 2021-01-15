package com.example.studb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studb.dto.StudentWithoutDept;
import com.example.studb.model.Department;
import com.example.studb.model.Performance;
import com.example.studb.model.Student;
import com.example.studb.service.DepartmentService;
import com.example.studb.service.PerformanceService;
import com.example.studb.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	private DepartmentService deptService;
	
	@Autowired
	private StudentService studentService;
	
	  @GetMapping("/getStudent/{stu_id}") 
	  public StudentWithoutDept getStudentById(@PathVariable int stu_id) {
		  
		  Optional<Student> student = studentService.getStudentById(stu_id); 
		  Optional<Department> dept = deptService.getDeptById(student.get().getDept_id());
		  
		  StudentWithoutDept st = new StudentWithoutDept(student.get().getId(),
				  student.get().getFirst_name(), student.get().getLast_name(),
				  student.get().getMobile_number(), student.get().getDate_of_joining(), dept.get().getName());
		  
		  //Optional<Student> stuOptional = Optional.of(student);
		  System.out.println("Student without dept id:: "+st);
		  return st;
	  }
	  
	  @GetMapping("/getStudents")
	  public List<Student> getAllStudents() {
		  List<Student> students = studentService.getAllStudents();
		  for (Student student : students) {
			
		  }
		  return students;
	  }
	 
	
	  @GetMapping("/getStudentByDept") 
	  public List<StudentWithoutDept> getAllStudentsByDept() {
		  return studentService.getStudentByDeptName();
	  }
	 
	  
	  @PostMapping("/addStudent")
	  public Student addStudent(@RequestBody Student student) {
		  
		  System.out.println("dept id:: "+deptService.getDeptById(student.getDept_id()).get().getDept_id()  );
		  System.out.println("comparing with dept_id:: "+student.getDept_id());
		  
		  if((deptService.getDeptById(student.getDept_id()).get().getDept_id()).equals(student.getDept_id())) {
			  System.out.println("Inside addStudent, inside if.");
			  return studentService.addStudent(student);  
		  }
		  else {
			  return null;
		  }
	  }
	  
	  @DeleteMapping("/deleteStudent/{stu_id}")
	  public void deleteStudent(@PathVariable int stu_id) {
		  studentService.deleteStudent(stu_id);
	  }
	  
	  @PutMapping("/updateStudent/{stu_id}")
	  public Student updateStudent(@RequestBody Student student, @PathVariable int stu_id) {
		  Optional<Student> st = studentService.getStudentById(stu_id);
		  
		  st.ifPresent(x->x.getId());
		  if(st.get().getId() == stu_id) {
			  return studentService.updateStudent(student, stu_id);
		  }else {
			  return null;
		  }
	  }
}
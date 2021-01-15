package com.example.studb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studb.model.Department;
import com.example.studb.model.Student;
import com.example.studb.service.DepartmentService;
import com.example.studb.service.StudentSubjectIdentityService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@Autowired
	private StudentSubjectIdentityService ssisn;
	
	@GetMapping("/getStudentsBySubject/{subjectId}")
	public List<Student> getStudentsBySubject(@PathVariable int subjectId){
		return ssisn.getAllStudentsBySubject(subjectId);
	}
	
	@GetMapping("/getdepts")
	public List<Department> getdepts(){
		return deptService.getAllDepartments();
	}
	
	@GetMapping("/getdept/{dept_id}")
	public Optional<Department> getdeptById(@PathVariable int dept_id) {
		return deptService.getDeptById(dept_id);
	}
	
	@DeleteMapping("/deletedept/{dept_id}")
	public void deletedept(@PathVariable int dept_id) {
		deptService.deleteDepartment(dept_id);
	}
	
	@PutMapping("/updatedept/{dept_id}")
	public Department updatedept(@RequestBody Department dept, @PathVariable int dept_id) {
		//return deptService.updateDepartment(dept);
		
		System.out.println("Department from React:: "+dept);
		 Optional<Department> st = deptService.getDeptById(dept_id);
		  
		  st.ifPresent(x->x.getDept_id());
		  if(st.get().getDept_id() == dept_id) {
			  System.out.println("Yes! the record is present.");
			  return deptService.updateDepartment(dept, dept_id);
		  }else {
			  return null;
		  }
		  
	}
	
	@PostMapping("/adddept")
	public Department adddept(@RequestBody Department dept) {
		System.out.println("Inside Department controller.");
		return deptService.addDepartment(dept);
	}
}

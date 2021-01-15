package com.example.studb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.model.Department;
import com.example.studb.model.Student;
import com.example.studb.model.Subject;
import com.example.studb.repository.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository deptRepo;
	
	public Optional<Department> getDeptById(int dept_id) {
		return deptRepo.findById(dept_id);
	}

	public List<Department> getAllDepartments() {
		return (List<Department>) deptRepo.findAll();
	}
	
	public void deleteDepartment(int dept_id) {
		deptRepo.deleteById(dept_id);
	}
	
	public Department addDepartment(Department dept) {
		return deptRepo.save(dept);
	}
	
	public Department updateDepartment(Department dept, int id ) {
		return deptRepo.save(dept);
	}
}

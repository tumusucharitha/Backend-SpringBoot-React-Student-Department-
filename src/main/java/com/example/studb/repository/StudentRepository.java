package com.example.studb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studb.dto.StudentWithoutDept;
import com.example.studb.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	  @Query("select new com.example.studb.dto.StudentWithoutDept(s.stu_id, s.first_name, s.last_name, s.mobile_number, s.date_of_joining, d.name)"
	  + "from Student s join Department d on s.dept_id = d.dept_id") 
	  List<StudentWithoutDept> getStudentByDeptName();
	
}

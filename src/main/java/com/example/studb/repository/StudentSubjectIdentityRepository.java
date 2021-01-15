package com.example.studb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studb.model.Student;
import com.example.studb.model.StudentSubject;
import com.example.studb.model.StudentSubjectIdentity;

@Repository
public interface StudentSubjectIdentityRepository extends CrudRepository<StudentSubject, StudentSubjectIdentity> {
	List<Student> findByStudentSubjectIdentitySubjectId(int subjectId);
}

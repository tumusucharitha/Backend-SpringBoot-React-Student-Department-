package com.example.studb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.model.Student;
import com.example.studb.repository.StudentSubjectIdentityRepository;

@Service
public class StudentSubjectIdentityService {

	@Autowired
	private StudentSubjectIdentityRepository studentSubjectIdentityRepository;
	
	public List<Student> getAllStudentsBySubject(int subjectId){
		return studentSubjectIdentityRepository.findByStudentSubjectIdentitySubjectId(subjectId);
	}
}

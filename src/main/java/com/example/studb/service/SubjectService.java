package com.example.studb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.model.Subject;
import com.example.studb.repository.SubjectRepository;

@Service
public class SubjectService 
{
	@Autowired
	private SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepo.findAll();
	}
	
	public Optional<Subject> getSubjectById(int subject_id) {
		return subjectRepo.findById(subject_id);
	}
	
	public void deleteSubject(int subject_id) {
		subjectRepo.deleteById(subject_id);
	}
	
	public Subject addSubject(Subject subject) {
		return subjectRepo.save(subject);
	}
	
	public Subject updateSubject(Subject subject) {
		return subjectRepo.save(subject);
	}
}

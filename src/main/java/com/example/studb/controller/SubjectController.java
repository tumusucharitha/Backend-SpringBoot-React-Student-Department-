package com.example.studb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studb.model.Subject;
import com.example.studb.service.SubjectService;

@RestController
public class SubjectController 
{
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/getSubjects")
	public List<Subject> getSubjects(){
		return subjectService.getAllSubjects();
	}
	
	@GetMapping("/getSubject/{Subject_id}")
	public Optional<Subject> getSubjectById(@PathVariable int Subject_id) {
		return subjectService.getSubjectById(Subject_id);
	}
	
	@DeleteMapping("/deleteSubject/{Subject_id}")
	public void deleteSubject(@PathVariable int Subject_id) {
		subjectService.deleteSubject(Subject_id);
	}
	
	@PutMapping("/updateSubject/{Subject_id}")
	public Subject updateSubject(@RequestBody Subject subject, @PathVariable int Subject_id) {
		return subjectService.updateSubject(subject);
	}
	
	@PostMapping("/addSubject")
	public Subject addSubject(@RequestBody Subject subject) {
		return subjectService.addSubject(subject);
	}

}

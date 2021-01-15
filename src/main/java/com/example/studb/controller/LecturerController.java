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

import com.example.studb.model.Lecturer;
import com.example.studb.service.LecturerService;

@RestController
public class LecturerController {

	@Autowired
	private LecturerService lecturerService;
	
	@GetMapping("/getLecturers")
	public List<Lecturer> getLecturers(){
		return lecturerService.getAllLecturers();
	}
	
	@GetMapping("/getLecturer/{lecturer_id}")
	public Optional<Lecturer> getLecturerById(@PathVariable int lecturer_id) {
		return lecturerService.getLecturerById(lecturer_id);
	}
	
	@DeleteMapping("/deleteLecturer/{lecturer_id}")
	public void deleteLecturer(@PathVariable int lecturer_id) {
		lecturerService.deleteLecturer(lecturer_id);
	}
	
	@PutMapping("/updateLecturer/{lecturer_id}")
	public Lecturer updateLecturer(@RequestBody Lecturer lecturer, @PathVariable int lecturer_id) {
		return lecturerService.updateLecturer(lecturer);
	}
	
	@PostMapping("/addLecturer")
	public Lecturer addLecturer(@RequestBody Lecturer lecturer) {
		return lecturerService.addLecturer(lecturer);
	}
}
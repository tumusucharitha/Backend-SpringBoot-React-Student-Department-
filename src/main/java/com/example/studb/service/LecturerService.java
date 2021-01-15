package com.example.studb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.model.Lecturer;
import com.example.studb.repository.LecturerRepository;

@Service
public class LecturerService {

	@Autowired
	private LecturerRepository lecturerRepo;
	
	public List<Lecturer> getAllLecturers() {
		return (List<Lecturer>) lecturerRepo.findAll();
	}
	
	public Optional<Lecturer> getLecturerById(int lecturer_id) {
		return lecturerRepo.findById(lecturer_id);
	}
	
	public void deleteLecturer(int lecturer_id) {
		lecturerRepo.deleteById(lecturer_id);
	}
	
	public Lecturer addLecturer(Lecturer lecturer) {
		return lecturerRepo.save(lecturer);
	}
	
	public Lecturer updateLecturer(Lecturer lecturer) {
		return lecturerRepo.save(lecturer);
	}
}
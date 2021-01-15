package com.example.studb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studb.model.Performance;
import com.example.studb.repository.PerformanceRepository;

@Service
public class PerformanceService {

	@Autowired
	private PerformanceRepository performRepo;
	
	public Optional<Performance> getPerformanceById(int perform_id) {
		return performRepo.findById(perform_id);
	}
}

package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Performance;
import com.contract.system.repository.PerformanceRepository;

@Service
public class PerformanceService {
	
private final PerformanceRepository performanceRepository;
	
	public PerformanceService(PerformanceRepository performanceRepository) {   // constructor injection with IOC
		this.performanceRepository = performanceRepository;
	}	
	
	public Performance save(Performance performance) {
		return performanceRepository.save(performance);		
	}
	
	public List<Performance> getPerformance(){
		List<Performance> c = new ArrayList<Performance>();
		performanceRepository.findAll().forEach(c :: add);
		return c;
	}

	public Performance find(Long performanceid) {
		return performanceRepository.findAllByPerformanceid(performanceid);
	}
	
	public List<Long> getPerformanceID() {
		return performanceRepository.findPerformanceID();
	}

}

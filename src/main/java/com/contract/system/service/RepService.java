package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Customer;
import com.contract.system.model.Rep;
import com.contract.system.repository.RepRepository;

@Service
public class RepService {
	
	private final RepRepository repRepository;
	
	public RepService(RepRepository repRepository) {
		this.repRepository = repRepository;
	}
	
	public Rep save(Rep rep) {
		return repRepository.save(rep);
		
	}
	
	public List<Rep> getRep(){
		List<Rep> c = new ArrayList<Rep>();
		repRepository.findAll().forEach(c :: add);
		return c;
	}

	public Rep find(Long repid) {
		return repRepository.findAllByRepid(repid);
	}
	
	
	public Rep getByCustomerid(Long repid){
		Rep c = new Rep();
		repRepository.findAllByRepid(repid);
		return c;
	}

	
	public List<String> getAllRepName() {
		List<String> r = new ArrayList<String>();
		repRepository.findRepname().forEach(r :: add);
		return r;	
	}
	
	public List<Rep> getRepbyCustomerid(Customer customerid){
		List<Rep> c = new ArrayList<Rep>();
		repRepository.findByCustomer(customerid).forEach(c :: add);
		System.out.println("From getRepbycustomer in service lawyer: "+c);
		return c;
	}
	
	public List<String> getRepnamebyCustomerid(Customer customerid){
		List<String> c = new ArrayList<String>();
		repRepository.findRepnameByCustomer(customerid).forEach(c :: add);
	
		return c;
	}
	
	public Rep findbyName(String name) {
		return repRepository.findByRepname(name);
	}

}

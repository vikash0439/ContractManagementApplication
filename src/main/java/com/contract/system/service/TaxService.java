package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Slot;
import com.contract.system.model.Tax;
import com.contract.system.repository.TaxRepository;

@Service
public class TaxService {

	public final TaxRepository taxRepository;
	
	public List<String> getAllSaccode(){
		return taxRepository.findAllSaccode();
	}

	public TaxService(TaxRepository taxRepository) {
		this.taxRepository = taxRepository;
	}

	public List<Tax> getTax() {
		// TODO Auto-generated method stub
		List<Tax> c = new ArrayList<Tax>();
		taxRepository.findAll().forEach(c :: add);
		return c;
	}

	public void save(Tax tax) {
		// TODO Auto-generated method stub
		taxRepository.save(tax);
	}

}

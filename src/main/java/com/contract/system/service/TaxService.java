package com.contract.system.service;

import org.springframework.stereotype.Service;

import com.contract.system.repository.TaxRepository;

@Service
public class TaxService {

	public final TaxRepository taxRepository;

	public TaxService(TaxRepository taxRepository) {
		this.taxRepository = taxRepository;
	}

}

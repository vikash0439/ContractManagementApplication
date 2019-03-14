package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Contract;
import com.contract.system.repository.ContractRepository;

@Service
public class ContractService {

	private final ContractRepository contractRepository;

	public ContractService(ContractRepository contractRepository) { // constructor injection with IOC
		this.contractRepository = contractRepository;
	}

	public Contract save(Contract invoice) {
		return contractRepository.save(invoice);
	}

	public List<Contract> getContract() {
		List<Contract> c = new ArrayList<Contract>();
		contractRepository.findAll().forEach(c::add);
		return c;
	}

	public Contract find(Long contractid) {
		return contractRepository.findAllByContractid(contractid);
	}

	public List<Long> getContractID() {
		return contractRepository.findContractID();
	}

	public void updateStatus(long contractid) {

		Contract contract = contractRepository.findAllByContractid(contractid);
//		contract.setOverride("cancelled");
		contractRepository.save(contract);

		System.out.println("Contract status updated");

	}

	public void updateCost(long contractid, String baseprice, String taxamount, String pact) {

		Contract contract = contractRepository.findAllByContractid(contractid);
//		contract.setTaxamount(taxamount);
		contract.setBaseprice(baseprice);
//		contract.setPact(pact);
		contractRepository.save(contract);

		System.out.println("Contract cost updated");
	}

	public void updateNoc(long contractid, String noc) {
		System.out.println(noc + " " + contractid);
		Contract contract = contractRepository.findAllByContractid(contractid);
//		contract.setNoc(noc);
		contractRepository.save(contract);

		System.out.println("Contract Noc updated");

	}

	public Long getContractCount(Long contractid) {
		// TODO Auto-generated method stub
		return contractRepository.CountContract(contractid);
	}

	public Long getTotal() {
		// TODO Auto-generated method stub
		return contractRepository.count();
	}

}

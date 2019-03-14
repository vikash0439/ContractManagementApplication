package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Customer;
import com.contract.system.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);		
	}
	
	public List<Customer> getCustomer(){
		List<Customer> c = new ArrayList<Customer>();
		customerRepository.findAll().forEach(c :: add);
		return c;
	}

	public Customer find(Long customerid) {
		return customerRepository.findAllByCustomerid(customerid);
	}
	
	public List<String> findName(){
		List<String> cname = new ArrayList<String>();
		customerRepository.findName().forEach(cname :: add);
		return cname;
	}

	public Customer findCustomer(String customername) {		
		return customerRepository.findByCustomername(customername);
	}


	public Long getCustomerID(String cname) {
		// TODO Auto-generated method stub
		return customerRepository.findIdByName(cname);
	}
	
	public List<Customer> getCustomerOutStation(){
		List<Customer> c = new ArrayList<Customer>();
		customerRepository.findAllOutStation().forEach(c :: add);
		return c;
	}
	
	public List<Customer> getMorningBooking(){
		System.out.println(customerRepository.getMorningCustomer());
		return customerRepository.getMorningCustomer();
	}


	public long getTotal() {
		// TODO Auto-generated method stub
		return customerRepository.count();
	}
	
	

}

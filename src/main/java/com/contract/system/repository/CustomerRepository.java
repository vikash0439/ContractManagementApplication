package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findAllByCustomerid(Long customerid);
	
	@Query(value = "select customername from customer;", nativeQuery = true)
	public List<String> findName();

	Customer findByCustomername(String customername);

	@Query(value = "select customerid from customer where customername = ?1 ;", nativeQuery = true)
	public Long findIdByName(String cname);

	@Query(value = "select * from customer where statecode <> 'DELHI (07)' ;", nativeQuery = true)
	List<Customer> findAllOutStation();

	@Query(value = "Call GetCustomerName() ;", nativeQuery = true)
	List<Customer> getMorningCustomer();
     
}

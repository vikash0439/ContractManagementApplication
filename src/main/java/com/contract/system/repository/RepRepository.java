package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Customer;
import com.contract.system.model.Rep;

public interface RepRepository extends JpaRepository<Rep, Integer>{

	Rep findAllByRepid(Long repid);

    @Query(value = "select repname from rep ", nativeQuery = true)
	List<String> findRepname();


    @Query(value = "select * from rep where customerid = ?1", nativeQuery = true)
	List<Rep> findByCustomer(Customer customerid);

    @Query(value = "select repname from rep where customerid = ?1", nativeQuery = true)
	List<String> findRepnameByCustomer(Customer customerid);

	Rep findByRepname(String name);

}

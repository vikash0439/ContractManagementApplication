package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Tax;

public interface TaxRepository extends JpaRepository<Tax, Long>{

	@Query(value = "select saccode from tax;", nativeQuery = true)
	List<String> findAllSaccode();


}

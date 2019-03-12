package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer>{

	Service findAllByServiceid(Long serviceid);

	@Query(value = "select servicename from service;", nativeQuery = true)
	public List<String> findName();

	public Service findByServicename(String ser);	
	
	@Query(value = "select unit from service where servicename = ?1 ;", nativeQuery = true)
	public String findUnitByServicename(String servicename);

}

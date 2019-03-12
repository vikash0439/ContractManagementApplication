package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import com.contract.system.model.Service;
import com.contract.system.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService {
	
private final ServiceRepository serviceRepository;
	
	public ServiceService(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}
	
	public Service save(Service service) {
		return serviceRepository.save(service);
		
	}
	
	public List<Service> getService(){
		List<Service> c = new ArrayList<Service>();
		serviceRepository.findAll().forEach(c :: add);
		return c;
	}

	public Service find(Long serviceid) {
		return serviceRepository.findAllByServiceid(serviceid);
	}

	public List<String> findName() {		
		List<String> sname = new ArrayList<String>();
		serviceRepository.findName().forEach(sname :: add);
		return sname;
	}

	public Service getDetail(String ser) {
		// TODO Auto-generated method stub
		return serviceRepository.findByServicename(ser);
	}
	
	public String getServiceUnit(String servicename) {
		return serviceRepository.findUnitByServicename(servicename);
	}

}

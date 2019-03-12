package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Venue;
import com.contract.system.repository.VenueRepository;

@Service
public class VenueService {
	
	private final VenueRepository venueRepository;

	public VenueService(VenueRepository venueRepository) {
		this.venueRepository = venueRepository;
	}
	
	
	public Venue save(Venue venue) {
		return venueRepository.save(venue);
		
	}
	
	public List<Venue> getAllVenue(){
		List<Venue> c = new ArrayList<Venue>();
		venueRepository.findAll().forEach(c :: add);
		return c;
	}


	public List<String> findVenue() {
		// TODO Auto-generated method stub
		List<String> vname = new ArrayList<String>();
		venueRepository.findVenue().forEach(vname :: add);
		return vname;
	}
}

package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Slot;
import com.contract.system.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Integer>{

	Slot findAllByVenueid(Long venueid);

	@Query(value = "select venuename from venue;", nativeQuery = true)
	public List<String> findVenue();
	
}

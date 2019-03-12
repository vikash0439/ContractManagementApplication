package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.contract.system.model.Slot;

public interface SlotRepository extends JpaRepository<Slot, Integer>{

	Slot findAllBySlotid(Long slotid);
    
	@Query(value = "select slotname from slot;", nativeQuery = true)
	public List<String> findSlot();
 
	@Query(value = "SELECT * FROM slot WHERE slotname = ?1 ", nativeQuery = true)
	Slot findBySLot(String slotname);




	
}

package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Slot;
import com.contract.system.repository.SlotRepository;

@Service
public class SlotService {
	
	private final SlotRepository slotRepository;

	public SlotService(SlotRepository slotRepository) {
		this.slotRepository = slotRepository;
	}
	
	
	public Slot save(Slot slot) {
		return slotRepository.save(slot);		
	}	
	public List<Slot> getSlot(){
		List<Slot> c = new ArrayList<Slot>();
		slotRepository.findAll().forEach(c :: add);
		return c;
	}
	public Slot find(Long slotid) {
		return slotRepository.findAllBySlotid(slotid);
	}

	public List<String> findSlot() {
		// TODO Auto-generated method stub
		List<String> sname = new ArrayList<String>();
		slotRepository.findSlot().forEach(sname :: add);
		return sname;
	}
	
	public Slot slotTiming(String slotname) {
		System.out.println(slotname);
		System.out.println(slotRepository.findBySLot(slotname));
		return slotRepository.findBySLot(slotname);
		
	}

	

}

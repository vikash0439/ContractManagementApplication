package com.contract.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contract.system.model.Booking;
import com.contract.system.repository.BookingRepository;

@Service
public class BookingService {
	
private final BookingRepository bookingRepository;
	
	public BookingService(BookingRepository bookingRepository) {   // constructor injection with IOC
		this.bookingRepository = bookingRepository;
	}	
	
	public Booking save(Booking booking) {
		return bookingRepository.save(booking);		
	}
	
	public List<Booking> getBooking(){
		List<Booking> c = new ArrayList<Booking>();
		bookingRepository.findAllByOrder().forEach(c :: add);
		return c;
	}

	public Booking find(Long serviceid) {
		return bookingRepository.findAllByBookingid(serviceid);
	}
	
	public List<Long> getBookingID() {
		return bookingRepository.findBookingID();
	}
	
	public List<String> getServiceDate() {
		return bookingRepository.findBookingDates();
	}
	
	public void deleteById(Booking booking) {
//		bookingRepository.delete(booking);
		Long bookingid = booking.getBookingid();	
		System.out.println("Booking deleted from BookingService class: " +bookingid);
//		int scost = Integer.parseInt(booking.getServicecost());
//		int pact = Integer.parseInt(booking.getContract().getPact());
		
		bookingRepository.deleteByServiceid(bookingid);	
	}
	
	public String findDistinctSlot(String date) {			
		System.out.println("Slot from Booking table db : "+bookingRepository.findByBookingdates(date));
		return bookingRepository.findByBookingdates(date);
	}

}

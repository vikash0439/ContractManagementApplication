package com.contract.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.contract.system.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{

	Booking findAllByBookingid(Long serviceid);
	
	@Query(value = "select * from booking;", nativeQuery = true)
	public List<String> findName();
	
	@Query(value = "select bookingid from booking;", nativeQuery = true)
	public List<Long> findBookingID();
	
	@Query(value = "select bookingdates from booking;", nativeQuery = true)
	public List<String> findBookingDates();

	@Query(value = "select * from booking Order by contractid Desc;", nativeQuery = true)
	List<Booking> findAllByOrder();
	
	@Query(value = "select slot from booking WHERE servicedate = ?1 ;", nativeQuery = true)
	String findByBookingdates(String date);
	
//	@Query(value = "delete from booking b WHERE b.serviceid = ?1 ;", nativeQuery = true)
//	public void deleteBooking(long serviceid);

	@Transactional
	@Modifying @Query(value = "delete from booking WHERE bookingid = ?1 ;", nativeQuery = true)
	public void deleteByServiceid(Long serviceid);
	   
}

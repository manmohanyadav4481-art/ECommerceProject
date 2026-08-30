package com.rapido.repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rapido.entity.BookingEntity;



@Repository
public class BookingRepository {

	@Autowired
	SessionFactory  sessionFactory;
	
	
	public int createBooking(String mobile, String src, String dest, String Type, String amount)
	{
		System.out.println("BookingRepository.createBooking():::::::::::::::");
	
		Session session = sessionFactory.getCurrentSession();
		
		BookingEntity bookingEntity = new BookingEntity();
	
		bookingEntity.setAmount(amount);
		bookingEntity.setDestination(dest);
		bookingEntity.setRidetype(Type);
		bookingEntity.setSource(src);
		bookingEntity.setMobile(mobile);
		
		
	BookingEntity responseEntity = (BookingEntity)	session.save(bookingEntity); //  Insert one record ing db (orm)
		
	 if (responseEntity.getId() > 0) 
	 {
		return responseEntity.getId(); 
	 }
	 
	 return 0;
	 
	}
}

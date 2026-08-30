package com.rapido.repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rapido.entity.BookingEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



@Repository
public class BookingRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	   
	public int createBooking(String mobile, String src, String dest, String Type, String amount)
	{
		System.out.println("BookingRepository.createBooking():::::::::::::::");
	
	//	Session session = sessionFactory.getCurrentSession();
		
		BookingEntity bookingEntity = new BookingEntity();
	
		bookingEntity.setAmount(amount);
		bookingEntity.setDestination(dest);
		bookingEntity.setRidetype(Type);
		bookingEntity.setSource(src);
		bookingEntity.setMobile(mobile);
		
		
	entityManager.persist(bookingEntity); //  Insert one record ing db (orm)
		
	 if (bookingEntity.getId() > 0) 
	 {
		return bookingEntity.getId(); 
	 }
	 
	 return 0;
	 
	}
}

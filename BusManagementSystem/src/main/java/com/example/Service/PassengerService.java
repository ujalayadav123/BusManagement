package com.example.Service;

import java.util.List;

import com.example.Entity.Passenger;

public interface PassengerService {
	Passenger addPassenger(Passenger p);
	
	List<Passenger> getAllPassenger();
	
	Passenger findbyId(int pid);
	
	Passenger updatePassenger(int id,Passenger p);
	
	String DeletePassenger(int id);
	
}
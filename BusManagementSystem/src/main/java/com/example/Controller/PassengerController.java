package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Passenger;
import com.example.Service.Impl.PassengerImpl;

@RestController
public class PassengerController {
	
	@Autowired
	PassengerImpl passengerImpl;
	
	@PostMapping("/passenger")
	ResponseEntity<Passenger> addpassenger(@RequestBody Passenger p){
		
		Passenger p1=passengerImpl.addPassenger(p);
		return new ResponseEntity<Passenger>(p1, HttpStatus.CREATED);
	}

	@GetMapping("/passenger/{id}")
	Passenger findById(@PathVariable int id) {
		return passengerImpl.findbyId(id);
	}
	
	@GetMapping("/passenger")
	List<Passenger> getAllPassengers(){
		return passengerImpl.getAllPassenger();
	}
	
	@PutMapping("/passenger/{id}")
	Passenger updatePassenger(@PathVariable int id,@RequestBody Passenger p) {
		return passengerImpl.updatePassenger(id, p);
	}
	
	@DeleteMapping("/passenger/{id}")
	String deletePassenger(@PathVariable int id) {
		return passengerImpl.DeletePassenger(id);
	}
	
}
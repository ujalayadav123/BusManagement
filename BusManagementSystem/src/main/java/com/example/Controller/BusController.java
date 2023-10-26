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

import com.example.Entity.Bus;
import com.example.Service.Impl.BusImpl;

@RestController
public class BusController {
	
	@Autowired
	BusImpl busImpl;

	@PostMapping("/bus")
	ResponseEntity<Bus> addBus(@RequestBody Bus b){
		Bus b1=busImpl.addBus(b);
		
		return new ResponseEntity<Bus>(b1,HttpStatus.CREATED);
	}

	@GetMapping("/bus/{id}")
	Bus findBusbyId(@PathVariable int id) {
		return busImpl.findbyId(id);
	}
	
	@GetMapping("/bus")
	List<Bus> findallBus(){
		return busImpl.getAllBus();
	}
	
	@PutMapping("/bus/{id}")
	Bus updateBus(@PathVariable int id,@RequestBody Bus b) {
		return busImpl.updateBusbyId(id, b);
		
	}
	
	@DeleteMapping("/bus/{id}")
	String deleteBus(@PathVariable int id) {
		return busImpl.deleteBusbyIdd(id);
	}
}
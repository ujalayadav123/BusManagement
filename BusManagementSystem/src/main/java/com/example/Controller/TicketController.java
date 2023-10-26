package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Ticket;
import com.example.Service.Impl.TicketImpl;

@RestController
public class TicketController {
	
	@Autowired
	TicketImpl ticketImpl;
	
	@PostMapping("/ticket")
	ResponseEntity<Ticket> addticket(@RequestBody Ticket t){
		Ticket t1=ticketImpl.addTicket(t);
		return new ResponseEntity<Ticket>(t1, HttpStatus.CREATED);
	}
	
	@GetMapping("/ticket")
	List<Ticket> findallTickets(){
		return ticketImpl.getAllTicket();
	}

}
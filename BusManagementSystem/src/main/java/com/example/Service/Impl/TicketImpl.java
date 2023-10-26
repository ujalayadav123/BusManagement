package com.example.Service.Impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Ticket;
import com.example.Repository.TicketRepository;
import com.example.Service.TicketService;

@Service
public class TicketImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public Ticket addTicket(Ticket p) {
		// TODO Auto-generated method stub
		Ticket t1=ticketRepository.save(p);
		t1.setBookingtime(LocalDateTime.now());
		return ticketRepository.save(t1);
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findbyId(int pid) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(pid).get();
	}

	

	@Override
	public String DeleteTicket(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
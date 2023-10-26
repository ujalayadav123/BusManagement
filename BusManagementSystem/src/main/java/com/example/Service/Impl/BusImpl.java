package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Bus;
import com.example.Repository.BusRepository;
import com.example.Service.BusService;

@Service
public class BusImpl implements BusService{

	@Autowired
	BusRepository busRepository;
	
	@Override
	public Bus addBus(Bus b) {
		// TODO Auto-generated method stub
		return busRepository.save(b);
	}

	@Override
	public List<Bus> getAllBus() {
		// TODO Auto-generated method stub
		return busRepository.findAll();
	}

	@Override
	public Bus findbyId(int bid) {
		// TODO Auto-generated method stub
		return busRepository.findById(bid).get();
	}

	@Override
	public Bus updateBusbyId(int id, Bus b) {
		// TODO Auto-generated method stub
		Bus b1=busRepository.findById(id).get();
		b1.setBusno(b.getBusno());
		b1.setName(b.getName());
		b1.setStartpoint(b.getStartpoint());
		b1.setDestination(b.getDestination());

		return busRepository.save(b1);
	}

	@Override
	public String deleteBusbyIdd(int id) {
		// TODO Auto-generated method stub
		
		busRepository.deleteById(id);
		return "Bus Deleted Successfully.";
	}

}
package com.example.Entity;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String Name;
	private String Startpoint;
	private String destination;
	private long busno;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bus")
	@JsonIgnore
	List<Passenger> passengers;
}
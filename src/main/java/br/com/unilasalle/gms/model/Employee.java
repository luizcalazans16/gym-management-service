package br.com.unilasalle.gms.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Employee {

	private UUID id;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Gym gym;
	
	private LocalDate contractDate;
	
	private LocalDate birhDate;
}

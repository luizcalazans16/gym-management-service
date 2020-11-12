package br.com.unilasalle.gms.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Workout {

	private UUID id;
	
	private String description;
	
	private String type;
	
	private List<Exercise> exercise;
	
}

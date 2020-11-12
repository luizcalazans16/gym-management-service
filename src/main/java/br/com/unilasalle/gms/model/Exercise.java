package br.com.unilasalle.gms.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Exercise {

	private UUID id;
	
	private String name;
	
}

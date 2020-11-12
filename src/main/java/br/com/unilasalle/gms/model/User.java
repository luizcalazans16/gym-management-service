package br.com.unilasalle.gms.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class User {

	private UUID id;
	
	private String name;
	
	private LocalDate birthDate;
	
	private LocalDate expirationDate;
	
	private String cpf;
	
	private Boolean isActive;
	
}

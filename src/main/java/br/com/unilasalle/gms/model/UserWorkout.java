package br.com.unilasalle.gms.model;

import lombok.Data;

@Data
public class UserWorkout {

	private User user;
	
	private Workout workout;
	
}

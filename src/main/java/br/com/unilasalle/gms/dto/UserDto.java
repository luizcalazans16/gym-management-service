package br.com.unilasalle.gms.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = UserDto.UserDtoBuilder.class)
public class UserDto {

	
	private UUID id;
	
	private String name;
	
	private LocalDate birthDate;
	
	private LocalDate expirationDate;
	
	private String cpf;
	
	private Boolean isActive;
	
	@JsonPOJOBuilder(withPrefix = "")
	public static final class UserDtoBuilder {
		
	}
}

package br.com.unilasalle.gms.mapper;

import br.com.unilasalle.gms.dto.UserDto;
import br.com.unilasalle.gms.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

	
	public static UserDto map (User entity) {
		return (entity == null) ? null :
			UserDto.builder()
			.id(entity.getId())
			.name(entity.getName())
			.birthDate(entity.getBirthDate())
			.expirationDate(entity.getExpirationDate())
			.cpf(entity.getCpf())
			.isActive(entity.getIsActive())
			.build();
			
	}
	
	public static User map(UserDto dto) {
		if (dto == null) {
			return null;
		} else {
			var entity = new User();
			
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setBirthDate(dto.getBirthDate());
			entity.setExpirationDate(dto.getExpirationDate());
			entity.setCpf(dto.getCpf());
			entity.setIsActive(dto.getIsActive());
			
			return entity;
		}
	}
}

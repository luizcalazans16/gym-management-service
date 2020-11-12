package br.com.unilasalle.gms.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.unilasalle.gms.dto.constants.PlanTypeEnum;
import lombok.Data;

@Entity
@Table
@Data
public class Plan {

	private UUID id;

	@Enumerated(EnumType.STRING)
	private PlanTypeEnum plan;

	private Boolean isActive;

}

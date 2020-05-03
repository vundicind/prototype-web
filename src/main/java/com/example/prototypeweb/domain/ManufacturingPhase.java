package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "manufacturing_phases")
@Entity
public class ManufacturingPhase {
	@Id
	@GeneratedValue
	private int id;
	private Short position;
	private String name;
	@Column(name = "norm_minutes")
	private Float normMinutes;
}

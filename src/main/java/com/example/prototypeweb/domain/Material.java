package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "materials")
@Entity
public class Material {
	@Id
	@GeneratedValue
	private int id;
	private String code;
	private String name;
	@JoinColumn(name = "mu_id")
	@ManyToOne
  private MeasurementUnit measurementUnit;
}

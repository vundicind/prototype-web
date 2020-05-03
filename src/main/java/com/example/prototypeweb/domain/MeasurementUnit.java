package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "measurement_units")
@Entity
public class MeasurementUnit {
	@Id
	@GeneratedValue
	private int id;
	private String code;
	private String name;
}

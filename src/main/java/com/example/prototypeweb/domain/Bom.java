package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Bom {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "material_id")
	private Material material;
	@ManyToOne
	@JoinColumn(name = "phase_id")
	private ManufacturingPhase phase;
	private Float consumption100;
}

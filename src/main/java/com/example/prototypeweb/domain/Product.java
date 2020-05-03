package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.*;

@Table(name = "products")
@Entity
@Data
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String code;
	private String name;
}

package com.example.prototypeweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "employees")
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private Short code;
	private String firstName;
	private String lastName;
}

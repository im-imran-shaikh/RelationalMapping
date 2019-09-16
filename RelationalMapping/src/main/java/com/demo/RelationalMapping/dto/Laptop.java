package com.demo.RelationalMapping.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Laptop
{
	@Id
	@GeneratedValue
	private int id;
	
	private String model;
	
	@Column(name = "Specification")
	private String spec;
	
	private int price;
	
	@ManyToOne
	private Categories categories;

	@ManyToMany(mappedBy = "laptop")
	private List<Student> student;
}

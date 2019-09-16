package com.demo.RelationalMapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Tablet
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
}

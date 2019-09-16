package com.demo.RelationalMapping.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Categories
{
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "categories")
	private List<Laptop> laptop;
	
	@OneToMany(mappedBy = "categories")
	private List<SmartPhone> smartPhone;
	
	@OneToMany(mappedBy = "categories")
	private List<Tablet> tablet;
}

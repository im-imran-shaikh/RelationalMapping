package com.demo.RelationalMapping.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class Student
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "StudentName")
	private String name;
	
	@ManyToMany
	private List<Laptop> laptop;
}

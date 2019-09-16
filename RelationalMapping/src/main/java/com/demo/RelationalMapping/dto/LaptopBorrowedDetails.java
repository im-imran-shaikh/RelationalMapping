package com.demo.RelationalMapping.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class LaptopBorrowedDetails 
{
	private String studentName;
	private String laptopModel;
	private int laptopPrice;
	private String categoryName;
	
	public LaptopBorrowedDetails(String studentName, String laptopModel, int laptopPrice , String categoryName)
	{
		super();
		this.studentName = studentName;
		this.laptopModel = laptopModel;
		this.laptopPrice = laptopPrice;
		this.categoryName = categoryName;
	}
	
	
	
	
}

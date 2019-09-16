package com.demo.RelationalMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.RelationalMapping.dao.CategoriesRepository;
import com.demo.RelationalMapping.dto.LaptopBorrowedDetails;

@RestController
public class Controller
{
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@GetMapping("/getLaptopBorrowedDetails")
	public List<LaptopBorrowedDetails> findLaptopsDetails()
	{
		List<LaptopBorrowedDetails> details = categoriesRepository.findlaptopBorrowedDetails();
		for ( LaptopBorrowedDetails detail : details)
		{
			System.out.println(detail.getStudentName() + " " + detail.getLaptopModel() + " " + detail.getLaptopPrice() + " " + detail.getCategoryName());
		}
		return categoriesRepository.findlaptopBorrowedDetails();
	}
}

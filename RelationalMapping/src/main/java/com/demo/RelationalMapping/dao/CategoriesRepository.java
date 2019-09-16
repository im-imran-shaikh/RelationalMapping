package com.demo.RelationalMapping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.demo.RelationalMapping.dto.Categories;
import com.demo.RelationalMapping.dto.LaptopBorrowedDetails;

@RepositoryRestResource(collectionResourceRel = "Categories", path = "Categories")
public interface CategoriesRepository extends JpaRepository<Categories, Integer>
{
	@Query("SELECT new com.demo.RelationalMapping.dto.LaptopBorrowedDetails(s.name, l.model, l.price,c.name) "
			+ "from Student s INNER JOIN Laptop l on s.id = l.id inner join Categories c on c.id = l.id")
	public List<LaptopBorrowedDetails> findlaptopBorrowedDetails();
}

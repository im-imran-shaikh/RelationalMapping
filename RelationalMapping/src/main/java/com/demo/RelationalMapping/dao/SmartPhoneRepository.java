package com.demo.RelationalMapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.RelationalMapping.dto.SmartPhone;

public interface SmartPhoneRepository extends JpaRepository<SmartPhone, Integer>
{

}

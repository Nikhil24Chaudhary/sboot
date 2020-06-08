package com.sboot.crud.springbootcrudapi.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.crud.springbootcrudapi.pojo.EmployeeEntity;

@Repository
public interface EmployeeRepository {
	public List<EmployeeEntity> getWork(int primaryKey) ;
}

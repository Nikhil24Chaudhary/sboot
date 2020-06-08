package com.sboot.crud.springbootcrudapi.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import com.sboot.crud.springbootcrudapi.dao.EmployeeRepository;
import com.sboot.crud.springbootcrudapi.pojo.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employeeList = repository.getWork(1);

		if (employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<EmployeeEntity>();
		}
	}

	public void test() throws SQLException {
	}
}

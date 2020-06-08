package com.sboot.crud.springbootcrudapi.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sboot.crud.springbootcrudapi.config.ApplicationConiguration;
import com.sboot.crud.springbootcrudapi.dao.EmployeeRepositoryImpl;
import com.sboot.crud.springbootcrudapi.pojo.EmployeeEntity;
import com.sboot.crud.springbootcrudapi.service.EmployeeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class AppController {

	@Autowired
	private ApplicationConiguration applicationConig;
	@Autowired
	private EmployeeService service;
	@Autowired
	EmployeeRepositoryImpl impl;

	@ApiOperation(value = "This is Greetings!!!", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping("/")
	@ResponseBody
	public String index() throws SQLException {
		impl.getWork(1);
		return "Welcome!!1! your active Profile is : " + applicationConig.getActiveProfile();
	}

	@RequestMapping("/getAllEmployees")
	@ResponseBody
	public List<EmployeeEntity> getAllEmployees() {
		return service.getAllEmployees();
	}
}

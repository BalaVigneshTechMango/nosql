package com.crud.nosql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.nosql.entity.EmployeeEntity;
import com.crud.nosql.service.NosqlService;

@RestController
@RequestMapping("/nosql")
public class NoSqlDemoController {

	@Autowired
	private NosqlService nosqlService;
	
	
	

	@PostMapping("/insert")
	public void insertMethod(@RequestBody EmployeeEntity employeeEntity) {
		nosqlService.insertValues(employeeEntity);
	}
//dbjdb
	@PostMapping("/getAll")
	public List<EmployeeEntity> getAll() {
	 List<EmployeeEntity> response=nosqlService.getAll();
	 return response;
	}
	@PostMapping("/update")
	public void update(@RequestBody EmployeeEntity employeeEntity) {
		nosqlService.update(employeeEntity);
	}
}

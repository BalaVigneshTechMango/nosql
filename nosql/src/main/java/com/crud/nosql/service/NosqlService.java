package com.crud.nosql.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.crud.nosql.entity.EmployeeEntity;
import com.crud.nosql.repository.EmployeeRepository;

@Service
public class NosqlService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public void insertValues(EmployeeEntity employeeEntity) {
		
		employeeRepository.save(employeeEntity);
	}

	public List<EmployeeEntity> getAll() {
		return employeeRepository.findAll();
	}

	public void update(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
	}
	
//	public long generateSequence(String seqName) {
//	    EmployeeEntity counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
//	      new Update().inc("seq",1), options().returnNew(true).upsert(true),
//	      EmployeeEntity.class);
//	    return !Objects.isNull(counter) ? counter.getSeq() : 1;
//	}
	
//	public int getSequence(String seqName) {
//		EmployeeEntity employeeEntity=mongoOperations.findAndModify(query(where("empId").is(seqName)), new  Update().inc("sequence",1),
//				options().returnNew(true).upsert(true),EmployeeEntity.class);
//		return !Objects.isNull(employeeEntity)? employeeEntity.getSequence():1;
//		
//	}
    

}

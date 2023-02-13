package com.crud.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.crud.nosql.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, Integer> {
	
}

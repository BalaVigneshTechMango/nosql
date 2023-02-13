package com.crud.nosql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class EmployeeEntity {

	 @Transient
	 public static final String SEQUENCE_NAME = "users_sequence";
	
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Id
	private int empId;
	private String sequence;
	private String fullName;
	private String address;

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public int getEmpId() {
		return empId;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

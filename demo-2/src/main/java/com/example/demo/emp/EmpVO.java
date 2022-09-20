package com.example.demo.emp;

import java.sql.Date;

import lombok.Data;
@Data	//lombok

public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	Integer salary;
	Date hireDate;
	String departmentId;
}

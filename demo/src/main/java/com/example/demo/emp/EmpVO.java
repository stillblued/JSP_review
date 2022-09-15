     package com.example.demo.emp;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpVO {
	
	String employeeId;
	String firstName;
	String lastName;
	String email;
	Date hireDate;
	String jobId;
	String departmentId;
	String profile;
	MultipartFile uploadFile;
	String salary;
	

}

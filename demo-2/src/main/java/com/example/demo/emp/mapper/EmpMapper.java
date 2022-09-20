package com.example.demo.emp.mapper;

import java.util.List;

import com.example.demo.emp.EmpVO;

public interface EmpMapper {
	List<EmpVO> findAll(); //아이디가 findAll이면 메소드도 같은 이름
	
}

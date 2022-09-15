package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {

	@Autowired EmpMapper dao;
	
	@RequestMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("empList", dao.findAll());
		return "emp/empList";
	}
	
	@RequestMapping("upEmp1")
	@ResponseBody
	public EmpVO upEmp1(EmpVO vo) {
	return vo;
	}
	
	@RequestMapping("upEmp2/{id}/{fname}")
	@ResponseBody
	public String upEmp2(@PathVariable String id, @PathVariable String fname) {
	return fname;
	}
	
}

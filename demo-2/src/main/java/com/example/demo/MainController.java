package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/user/user")
	public void user() {
	}

	@GetMapping("/admin/admin")
	public void admin() {
	}
	
	@GetMapping("/top")
	public void top() {
	}

}

package com.esgi.annualProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	@RequestMapping(path="/user.html")
	public String showUserPage(ModelMap model) {
		
		model.put("test", "this is a test");
		
		return "user";
	}
}

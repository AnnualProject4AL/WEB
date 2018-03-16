package com.esgi.annualProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(path="/")
	public String defaultHandler(ModelMap model) {
		
		return "login";
	}

	@PostMapping(path="/login.html")
	public String showLoginPage(String username, String password) {
		System.out.println("--------------> "+username+" --- "+password);
		if (username != null && password != null) {
			return "redirect:/newsfeed.html";
		}
		
		return "login";
	}
		
	@RequestMapping(path="/logout.html")
	public String logout(ModelMap model) {
		
		return "login";
	}
}

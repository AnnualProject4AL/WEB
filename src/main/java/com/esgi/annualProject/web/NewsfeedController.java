package com.esgi.annualProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class NewsfeedController {

	@RequestMapping(path="/newsfeed.html")
	public String showNewsfeed(ModelMap model) {
		
		return "newsfeed";
	}
}

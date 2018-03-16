package com.esgi.annualProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MovieController {

	@RequestMapping(path="/movie.html")
	public String showMoviePage(ModelMap model) {
		
		return "movie";
	}
}

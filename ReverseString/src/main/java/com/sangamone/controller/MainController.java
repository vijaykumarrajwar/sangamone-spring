package com.sangamone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @RequestMapping("/reverse")
	public String home() {
		return "home";
	}
	
}

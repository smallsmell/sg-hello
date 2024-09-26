package com.smallsmell.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String helloPageModel(Model model) {
		model.addAttribute("greeting", "Hello!!!");
		return "hello";
	}
}

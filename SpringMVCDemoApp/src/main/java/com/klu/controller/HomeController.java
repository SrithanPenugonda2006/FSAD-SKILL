package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.klu.model.Message;
import com.klu.service.MessageService;



@Controller
public class HomeController {

	@Autowired
	private MessageService ms;
	@GetMapping("/")
	public String home(Model model) {
		Message m = new Message(ms.getMessage());
		model.addAttribute("message", m);
		return "home";
	}
	
}

package com.livrariasmelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/ola")
	public String index() {
		System.out.println("Acessando a página inicial");
		return "home";
	}
}

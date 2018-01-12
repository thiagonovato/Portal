package com.logusit.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CorrespondenteController {

	@RequestMapping("/correspondente/novo")
	public String form() {
		return "cadastroCorrespondente";
	}
	
}

package com.logusit.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logusit.portal.util.SenderMailService;

@Controller
public class IndexController {
	
	@Autowired
    SenderMailService senderMailService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping("/teste")
	public void testEnvioEmail() {
	      senderMailService.enviar();
  }

	@RequestMapping("/sobre-o-softjur")
	public String softjur() {
		return "softjur";
	}

	@RequestMapping("/suporte")
	public String suporte() {
		return "suporte";
	}

}

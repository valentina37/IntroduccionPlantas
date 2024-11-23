package com.plantas.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWebNosotros {
	@GetMapping("/nosotros")
	public String compartidoIndexTemplate(Model model) {
		return "nosotros";
	}
}

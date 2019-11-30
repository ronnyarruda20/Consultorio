package com.consultorio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {
	
	@RequestMapping(value = "/novo")
	public String helloWorld() {
		return "Paciente Controller";
	}

}

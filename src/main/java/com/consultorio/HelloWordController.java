package com.consultorio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@RequestMapping(value = "/cursos")
	public String helloWorld() {
		return "hello World";
	}

}

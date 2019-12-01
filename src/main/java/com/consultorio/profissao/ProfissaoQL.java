package com.consultorio.profissao;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class ProfissaoQL implements GraphQLQueryResolver {
	
	@Autowired
	private ProfissaoService service;
	
}

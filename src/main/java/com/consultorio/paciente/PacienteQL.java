package com.consultorio.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class PacienteQL implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private PacienteService pacienteService;
	
	public Paciente consultarPacientePorId(Long id) {
		return pacienteService.findById(id);
	}
	
	public List<Paciente> consultarTodosPacientes(){
		return pacienteService.findAll();
	}
	
	public void incluirPaciente(PacienteDTO PacienteDTO) {
		pacienteService.salvar(PacienteDTO);
	}
	
	public void excluirPaciente(Long id) {
		pacienteService.excluir(id);
	}

}

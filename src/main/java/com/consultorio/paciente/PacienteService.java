package com.consultorio.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

	@Autowired
	private PacienteReposiory pacienteReposiory;

	public Paciente findById(Long id) {
		return pacienteReposiory.findById(id).get();

	}

	public void salvar(Paciente paciente) {
		pacienteReposiory.save(paciente);
	}
	
	public List<Paciente> findAll(){
		return pacienteReposiory.findAll();
	}
}

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

	public List<Paciente> findAll(){
		return pacienteReposiory.findAll();
	}
	
	public void salvar(PacienteDTO pacienteDTO) {
		Paciente paciente = new Paciente();
		paciente.setNome(pacienteDTO.getNome());
		paciente.setDataNascimento(pacienteDTO.getDataNascimento());
		pacienteReposiory.save(paciente);
	}
	
	public void excluir(Long id) {
		Paciente paciente = findById(id);
		pacienteReposiory.delete(paciente);
	}
}

package com.consultorio.paciente;

import lombok.Getter;
import lombok.Setter;


public class PacienteDTO {

	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String endereco;

	@Getter @Setter
	private String telefone;

	@Getter @Setter
	private String dataNasimento;

	@Getter @Setter
	private String profissao; 
}

package com.consultorio.paciente;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PacienteDTO {

	private Long id;

	private String nome;

	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private Date dataNascimento;

	private List<Long> profissoes; 
}

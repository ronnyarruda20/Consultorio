package com.consultorio.paciente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "PACIENTE")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 7386636392891509188L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idPaciente")
	private Long id;
	
	@Column(name="nome")
	private String nome;

	@Column(name="endereco")
	private String endereco;

	@Column(name="telefone")
	private String telefone;

	@Column(name="dataNacimento")
	private String dataNasimento;

	@Column(name="profissao")
	private String profissao;
	

}

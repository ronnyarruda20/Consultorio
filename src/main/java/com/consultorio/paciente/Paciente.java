package com.consultorio.paciente;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.consultorio.profissao.Profissao;

import lombok.Data;

@Data
@Entity(name = "PACIENTE")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 7386636392891509188L;

	@Id
	@GeneratedValue(generator="SEQ_PACIENTE", strategy=GenerationType.AUTO)
    @SequenceGenerator(name="SEQ_PACIENTE", sequenceName="SEQ_PACIENTE")
	@Column(name = "IDPACIENTE")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "DATANACIMENTO")
	private Date dataNascimento;

	@Column(name = "DATACADASTRO")
	private Date dataCadastro;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PACIENTE_PROFISSAO", 
		joinColumns = { @JoinColumn(name = "IDPACIENTE") }, 
		inverseJoinColumns = { @JoinColumn(name = "IDPROFISSAO") })
	private List<Profissao> profissoes;

}

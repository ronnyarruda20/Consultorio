package com.consultorio.profissao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Profissao implements Serializable{


	private static final long serialVersionUID = -6960955104762276558L;

	@Id
	@GeneratedValue(generator="SEQ_PROFISSAO", strategy=GenerationType.AUTO)
    @SequenceGenerator(name="SEQ_PROFISSAO", sequenceName="SEQ_PROFISSAO")
	@Column(name="IDPROFISSAO")
	private Long id;

	@Column(name="CODIGO")
	private String codigo;

	@Column(name="DESCRICAO")
	private String descricao;
	
}

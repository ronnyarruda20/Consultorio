package com.consultorio.profissao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 interface ProfissaoRepository  extends JpaRepository<Profissao, Long> {

}

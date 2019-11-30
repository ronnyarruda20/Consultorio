package com.consultorio.paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface PacienteReposiory extends JpaRepository<Paciente, Long> {

}

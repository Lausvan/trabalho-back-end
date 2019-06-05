package br.unisul.pweb.quarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}

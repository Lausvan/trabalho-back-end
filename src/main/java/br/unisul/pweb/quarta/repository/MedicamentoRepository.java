package br.unisul.pweb.quarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{

}

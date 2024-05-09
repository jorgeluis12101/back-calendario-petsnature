package com.upao.petsnature.infra.repository;

import com.upao.petsnature.domain.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}

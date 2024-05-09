package com.upao.petsnature.infra.repository;

import com.upao.petsnature.domain.entity.Consejo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsejoRepository extends JpaRepository<Consejo, Long> {
    List<Consejo> findByRazaId(Long razaId);
}

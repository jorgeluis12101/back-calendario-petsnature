package com.upao.petsnature.infra.repository;

import com.upao.petsnature.domain.entity.Raza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RazaRepository extends JpaRepository<Raza, Long> {
}

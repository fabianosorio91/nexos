package com.auto.nexos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.nexos.model.empleados;

public interface cargoRepository extends JpaRepository<empleados, Integer> {

}

package com.example.ejercicio_duenio_mascotas.repository;

import com.example.ejercicio_duenio_mascotas.model.Duenios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueniosRepository extends JpaRepository<Duenios,Long>{
    
}

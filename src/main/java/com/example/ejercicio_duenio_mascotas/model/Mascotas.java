package com.example.ejercicio_duenio_mascotas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Mascotas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    @JoinColumn (name="id_duenio",
                 referencedColumnName = "id_duenio")
    private Duenios unDuenio;

    public Mascotas() {
    }
    
    public Mascotas(Long id_mascota, String nombre, String especie, String raza, String color, Duenios unDuenio) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDuenio = unDuenio;
    }
  
}

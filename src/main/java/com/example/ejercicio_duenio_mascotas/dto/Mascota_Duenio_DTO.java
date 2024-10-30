package com.example.ejercicio_duenio_mascotas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mascota_Duenio_DTO {
    
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;

    public Mascota_Duenio_DTO() {
    }

    public Mascota_Duenio_DTO(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }
   
}

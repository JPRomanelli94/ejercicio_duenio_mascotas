package com.example.ejercicio_duenio_mascotas.controller;

import com.example.ejercicio_duenio_mascotas.dto.Mascota_Duenio_DTO;
import com.example.ejercicio_duenio_mascotas.model.Mascotas;
import com.example.ejercicio_duenio_mascotas.service.MascotasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMascotas {
    
    @Autowired
    private MascotasService mascoServ;
    
    @PostMapping("/crear/mascotas")
    public String createMascotas (@RequestBody Mascotas masco){
        mascoServ.createMascotas(masco);
        return "Mascotas creadas correctamente";
    }
    
    @GetMapping("/consulta/mascotas")
    public List<Mascotas> buscarMascotas (){
        return mascoServ.getMascotas();
    }
    
    @PutMapping("/edit/mascotas")
    public String editMascotas(@RequestBody Mascotas masco){
        mascoServ.editMascotas(masco);
        return "Mascota editada correctamente";
    }
    
    @DeleteMapping("/delete/mascotas/{id}")
    public String deleteMascotas(@PathVariable Long id){
        mascoServ.deleteMascotas(id);
        return "Mascota borrada correctamente";
    }
    
     @GetMapping("/consulta/mascotas/condicion")
    public List<Mascotas> buscarMascotasCondicionado (){
        return mascoServ.getMascotasCondicionadas();
    }
    
    @GetMapping("/consulta/mascotas/duenios")
    public List<Mascota_Duenio_DTO> buscarMascotasDueniosDTO (){
        return mascoServ.getMascotasDueniosDTO();
    }
    
}

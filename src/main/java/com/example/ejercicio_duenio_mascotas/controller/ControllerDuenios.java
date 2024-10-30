package com.example.ejercicio_duenio_mascotas.controller;

import com.example.ejercicio_duenio_mascotas.model.Duenios;
import com.example.ejercicio_duenio_mascotas.service.DueniosService;
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
public class ControllerDuenios {
    
    @Autowired
    DueniosService duServ;
    
    @PostMapping("/crear/duenios")
    public String createDuenios (@RequestBody Duenios duenio){
        duServ.createDuenios(duenio);
        return "Duenios creados correctamente";
    }
    
    @GetMapping("/consulta/duenios")
    public List<Duenios> buscarDuenios (){
        return duServ.getDuenios();
    }
    
    @PutMapping("/edit/duenios")
    public String editDuenios(@RequestBody Duenios duenio){
        duServ.editDuenios(duenio);
        return "Duenio editado correctamente";
    }
    
    @DeleteMapping("/delete/duenios/{id}")
    public String deleteDuenios(@PathVariable Long id){
        duServ.deleteDuenios(id);
        return "Duenio borrado correctamente";
    }
    
    
}

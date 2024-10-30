package com.example.ejercicio_duenio_mascotas.service;

import com.example.ejercicio_duenio_mascotas.model.Duenios;
import java.util.List;


public interface IDueniosService {
    
    public List<Duenios> getDuenios();
    
    public void createDuenios(Duenios duenio);
    
    public void editDuenios (Duenios duenio);
    
    public void deleteDuenios (Long id_duenio);
    
}

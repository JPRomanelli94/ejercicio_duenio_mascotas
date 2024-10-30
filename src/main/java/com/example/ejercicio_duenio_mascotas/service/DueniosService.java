package com.example.ejercicio_duenio_mascotas.service;

import com.example.ejercicio_duenio_mascotas.model.Duenios;
import com.example.ejercicio_duenio_mascotas.repository.IDueniosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DueniosService implements IDueniosService{
    
    @Autowired
    IDueniosRepository duRepo;
    
    @Override
    public List<Duenios> getDuenios() {
        return duRepo.findAll();
    }

    @Override
    public void createDuenios(Duenios duenio) {
        duRepo.save(duenio);
    }

    @Override
    public void editDuenios(Duenios duenio) {
        duRepo.save(duenio);
    }

    @Override
    public void deleteDuenios(Long id_duenio) {
        duRepo.deleteById(id_duenio);
    }
    
}

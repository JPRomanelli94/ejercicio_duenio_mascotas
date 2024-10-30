package com.example.ejercicio_duenio_mascotas.service;

import com.example.ejercicio_duenio_mascotas.dto.Mascota_Duenio_DTO;
import com.example.ejercicio_duenio_mascotas.model.Mascotas;
import com.example.ejercicio_duenio_mascotas.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotasService implements IMascotasService{
    
    @Autowired
    private IMascotaRepository mascoRepo;
    
    @Override
    public List<Mascotas> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void createMascotas(Mascotas masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void editMascotas(Mascotas masco) {
        this.createMascotas(masco);
    }

    @Override
    public void deleteMascotas(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    public List<Mascotas> getMascotasCondicionadas() {
        List<Mascotas> allMascotas = this.getMascotas();
        List<Mascotas> listaDefinitiva = new ArrayList<>();
        for (Mascotas masco:allMascotas){
            if ((masco.getEspecie().equals("Perro")) && (masco.getRaza().equals("Caniche"))){
                listaDefinitiva.add(masco);
            }
        }
        
        return listaDefinitiva;
    }

    public List<Mascota_Duenio_DTO> getMascotasDueniosDTO() {
        List<Mascotas> allMascotas = this.getMascotas();
        List<Mascota_Duenio_DTO> listaDTO = new ArrayList<>();
        String nombre = null;
        String apellido = null;
        for (Mascotas masco:allMascotas){
            Mascota_Duenio_DTO mascoDto = new Mascota_Duenio_DTO();
            mascoDto.setNombre_mascota(masco.getNombre());
            mascoDto.setEspecie(masco.getEspecie());
            mascoDto.setRaza(masco.getRaza());
            if (masco.getUnDuenio()!=null){
                nombre = masco.getUnDuenio().getNombre();
                apellido = masco.getUnDuenio().getApellido();
                mascoDto.setNombre_duenio(nombre);
                mascoDto.setApellido_duenio(apellido);}
            else {
                mascoDto.setNombre_duenio("null");
                mascoDto.setApellido_duenio("null");
            }
            listaDTO.add(mascoDto);
        }
        
        return listaDTO;
    }

}

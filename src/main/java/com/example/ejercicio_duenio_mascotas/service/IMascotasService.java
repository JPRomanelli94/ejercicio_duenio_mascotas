package com.example.ejercicio_duenio_mascotas.service;

import com.example.ejercicio_duenio_mascotas.dto.Mascota_Duenio_DTO;
import com.example.ejercicio_duenio_mascotas.model.Mascotas;
import java.util.List;

public interface IMascotasService {
    
    public List<Mascotas> getMascotas();
    
    public void createMascotas(Mascotas masco);
    
    public void editMascotas (Mascotas masco);
    
    public void deleteMascotas (Long id_mascota);
    
    public List<Mascotas> getMascotasCondicionadas();
    
    public List<Mascota_Duenio_DTO> getMascotasDueniosDTO();
    
}

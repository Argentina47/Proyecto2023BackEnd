/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto2023.soniasoacha.Security.Service;

import com.proyecto2023.soniasoacha.Security.Entity.Rol;
import com.proyecto2023.soniasoacha.Security.Enums.RolNombre;
import com.proyecto2023.soniasoacha.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional <Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByNombre(rolNombre);
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
    
}

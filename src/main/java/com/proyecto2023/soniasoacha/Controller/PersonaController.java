/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto2023.soniasoacha.Controller;

import com.proyecto2023.soniasoacha.Entity.Persona;
import com.proyecto2023.soniasoacha.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;

    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    
    public String createPersona(@RequestBody Persona persona){
    ipersonaService.save(persona);
    return "La persona fue creada correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
       ipersonaService.delete(id);
       return "La persona fue eliminada correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
      @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long Id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("Apellido") String nuevoApellido,
            @RequestParam("Img") String nuevoImg)
    {
        Persona persona =ipersonaService.get(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);

        ipersonaService.save(persona);
        return persona;
    }

        @GetMapping("personas/traer/perfil")
        public Persona findPersona(){
        return ipersonaService.getOne(1);
}
}

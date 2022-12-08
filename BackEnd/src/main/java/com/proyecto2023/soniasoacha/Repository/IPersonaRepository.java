
package com.proyecto2023.soniasoacha.Repository;

import com.proyecto2023.soniasoacha.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository  <Persona,Long>{
    
    
    
}

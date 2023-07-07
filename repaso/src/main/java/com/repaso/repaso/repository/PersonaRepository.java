/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repaso.repaso.repository;

import com.repaso.repaso.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Danie
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}

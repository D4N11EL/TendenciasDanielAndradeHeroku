/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.repaso.service;

import com.repaso.repaso.GenericService;
import com.repaso.repaso.GenericServiceImpl;
import com.repaso.repaso.model.Persona;
import com.repaso.repaso.repository.PersonaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danie
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository personarepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return (CrudRepository<Persona, Long>) personarepository;
    }

}

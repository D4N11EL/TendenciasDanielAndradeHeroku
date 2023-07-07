/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.repaso.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Danie
 */
@Document(collection = "Persona")
@Data
public class Persona {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Contactos contactos;
    private List<Telefonia> listatelefonia;

}

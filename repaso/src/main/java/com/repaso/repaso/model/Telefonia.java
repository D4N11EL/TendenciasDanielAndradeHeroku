/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.repaso.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Danie
 */
@Document(collection = "Telefonia")
@Data
public class Telefonia {
    
    private String tipo_telefonia;
    private String telefono;
    
}

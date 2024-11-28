package com.producto.producto.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Producto {
    private Integer idprod;
    private String nomprod;
    private double valor;
    private Integer cantidad;
    
}

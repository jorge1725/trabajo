package com.producto.producto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.producto.producto.models.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class DatosController {

    private List<Producto> datoss = new ArrayList<>(
       Arrays.asList(new Producto(456, "Sombras", 42.600, 2)) 
    );

    @GetMapping("/datos")
    public List <Producto> getdDatoss() {
        return datoss;
    }

    @PostMapping("/datos")
    public Producto postdatos(@RequestBody Producto datos) {
        
        datoss.add(datos);
        
        return datos;
    }
    
    
}


package com.producto.producto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producto.producto.models.Producto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/datos")
public class ProductosController {

    private List<Producto> productos = new ArrayList<>(
        Arrays.asList(new Producto(456, "Sombras", 42.600, 2))
    );
    @GetMapping("productos")
        public List<Producto> getpProductos() {
            return productos;
        }

        @GetMapping("producto/{nomprod}")
        public Producto getProducto(@PathVariable String nomprod) {
            for(Producto p : productos) {
                if(p. getNomprod().equalsIgnoreCase(nomprod)) {
                    return p;
                }
            }
            return null;
        }

    @PostMapping("producto")
    public Producto postProducto(@RequestBody Producto producto ) {
        productos.add(producto);
        return producto;
    }

    @PutMapping("producto")
    public Producto putproducto(@RequestBody Producto producto) {
        for (Producto p : productos) {
            if (p.getIdprod() == producto.getIdprod()) {
                p.setNomprod(producto.getNomprod());
                p.setValor(producto.getValor());
                p.setCantidad(producto.getCantidad());
                return p;
            }
        }
        
        return null;
    }

    @DeleteMapping("cliente/{idprod}")
public Producto delteproducto(@PathVariable int idprod) {
    for (Producto p : productos) {
        if (p.getIdprod() == idprod) {
            productos.remove(p);
            return p;
            }
        }
        return null;
    }
    
    
    
}


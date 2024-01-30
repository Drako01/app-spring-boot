// src/main/java/com/example/springboot/service/ProductoService.java

package com.example.springboot.service;

import com.example.springboot.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> obtenerTodosProductos();
    Producto crearProducto(Producto producto);
    Producto obtenerProductoPorId(Long id);
}

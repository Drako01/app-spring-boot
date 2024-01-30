// src/main/java/com/example/springboot/service/ProductoService.java

package com.example.springboot.service;

import com.example.springboot.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> obtenerTodosProductos();
    Producto obtenerProductoPorId(Long id);
    Producto actualizarProductoPorId(Long id);
    Producto actualizarProducto(Long id, Producto productoModificado);
    Producto crearProducto(Producto producto);
}

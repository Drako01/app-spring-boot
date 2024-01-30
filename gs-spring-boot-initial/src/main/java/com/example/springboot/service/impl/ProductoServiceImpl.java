// src/main/java/com/example/springboot/service/impl/ProductoServiceImpl.java

package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Producto;
import com.example.springboot.repository.ProductoRepository;
import com.example.springboot.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAllRandom();
    }
    
    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    
    @Override
    public Producto obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
    
    @Override
    public Producto actualizarProductoPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
    @Override
    public Producto actualizarProducto(Integer id, Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public void eliminarProductoPorId(Integer id) {
        productoRepository.deleteById(id);
    }

    
}

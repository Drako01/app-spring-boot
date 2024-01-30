// src/main/java/com/example/springboot/service/impl/ProductoServiceImpl.java

package com.example.springboot.service.impl;

import com.example.springboot.model.Producto;
import com.example.springboot.repository.ProductoRepository;
import com.example.springboot.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }
    
    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    
    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
    
    
}

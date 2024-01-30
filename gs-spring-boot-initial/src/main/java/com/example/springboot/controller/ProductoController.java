package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.model.Producto;
import com.example.springboot.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(Model model) {
       
        model.addAttribute("imagePath", "/img/spring.png");
        model.addAttribute("pageTitle", "Agregar Producto");
        model.addAttribute("titulo", "Agregar Producto");
        model.addAttribute("nuevoProducto", new Producto());
        return "productos_agregar";
    }

    @PostMapping("/agregar")
    public ModelAndView crearProducto(@ModelAttribute("nuevoProducto") Producto nuevoProducto, Model model) {
        
        if (nuevoProducto == null) {
           
            return new ModelAndView("error");
        }

        Producto productoCreado = productoService.crearProducto(nuevoProducto);
        if (productoCreado != null) {
           
            model.addAttribute("imagePath", "/img/spring.png");
            model.addAttribute("pageTitle", "Agregar Producto");
            model.addAttribute("titulo", "Agregar Producto");
            model.addAttribute("nuevoProducto", new Producto());
            return new ModelAndView("productos_agregar");
        } else {
           
            return new ModelAndView("error");
        }
    }

    @GetMapping("/detalles/{id}")
    public String obtenerDetallesProducto(@PathVariable Long id, Model model) {        
        Producto producto = productoService.obtenerProductoPorId(id);
        if (producto != null) {
           
            model.addAttribute("producto", producto);
            model.addAttribute("imagePath", "/img/spring.png");
            model.addAttribute("pageTitle", "Detalles del Producto");
            model.addAttribute("titulo", "Detalles del Producto");
            return "products_detail";
        } else {
           
            return "error";
        }
    }
}

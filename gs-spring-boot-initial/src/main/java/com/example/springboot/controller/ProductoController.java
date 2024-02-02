package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.model.Producto;
import com.example.springboot.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	private final ProductoService productoService;

	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping("/agregar")
	public String mostrarFormularioAgregar(Model model) {

		model.addAttribute("imagePath", "/img/spring.png");
		model.addAttribute("pageTitle", "Agregar Producto | App Spring Boot");
		model.addAttribute("titulo", "Agregar Producto");
		model.addAttribute("nuevoProducto", new Producto());
		return "productos_agregar";
	}

	@PostMapping("/agregar")
	public ModelAndView crearProducto(@ModelAttribute("nuevoProducto") 
	Producto nuevoProducto, Model model) {

		if (nuevoProducto == null) {

			return new ModelAndView("error");
		}

		Producto productoCreado = productoService.crearProducto(nuevoProducto);
		if (productoCreado != null) {

			model.addAttribute("imagePath", "/img/spring.png");
			model.addAttribute("pageTitle", "Agregar Producto | App Spring Boot");
			model.addAttribute("titulo", "Agregar Producto");
			model.addAttribute("nuevoProducto", new Producto());
			return new ModelAndView("productos_agregar");
		} else {

			return new ModelAndView("error");
		}
	}

	@GetMapping("/detalles/{id}")
	public String obtenerDetallesProducto(@PathVariable Integer id, Model model) {
		Producto producto = productoService.obtenerProductoPorId(id);
		if (producto != null) {

			model.addAttribute("producto", producto);
			model.addAttribute("imagePath", "/img/spring.png");
			model.addAttribute("pageTitle", "Detalles del Producto | App Spring Boot");
			model.addAttribute("titulo", "Detalles del Producto");			
			return "products_detail";
		} else {
			model.addAttribute("pageTitle", "Error 404 - El producto no existe.");
	    	model.addAttribute("imagePath", "/img/spring.png");
	        model.addAttribute("imageError", "/img/sinstock.png");       
	        model.addAttribute("titulo", "El producto " + id + " no existe o no hay Stock.");
			return "error-product";
		}
	}

	@GetMapping("/modificar/{id}")
	public String mostrarFormularioModificar(@PathVariable Integer id, Model model) {
		Producto producto = productoService.obtenerProductoPorId(id);

		if (producto != null) {
			model.addAttribute("imagePath", "/img/spring.png");
			model.addAttribute("pageTitle", "Modificar Producto | App Spring Boot");
			model.addAttribute("titulo", "Modificar Producto");
			model.addAttribute("nuevoProducto", producto);
			return "modificar_producto";
		} else {

			return "error";
		}
	}

	@PostMapping("/modificar/{id}")
	public ModelAndView actualizarProducto(@PathVariable Integer id,
			@ModelAttribute("nuevoProducto") Producto productoModificado, Model model) {
		Producto productoExistente = productoService.obtenerProductoPorId(id);

		if (productoExistente != null) {
			productoExistente.setNombre(productoModificado.getNombre());
			productoExistente.setDescripcion(productoModificado.getDescripcion());
			productoExistente.setImagen(productoModificado.getImagen());
			productoExistente.setPrice(productoModificado.getPrice());
			productoExistente.setStock(productoModificado.getStock());

			productoService.actualizarProducto(id, productoExistente);

			model.addAttribute("imagePath", "/img/spring.png");
			model.addAttribute("pageTitle", "Modificar Producto | App Spring Boot");
			model.addAttribute("titulo", "Modificar Producto");
			model.addAttribute("nuevoProducto", productoExistente);

			return new ModelAndView("modificar_producto");
		} else {
			return new ModelAndView("error");
		}
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Integer id) {
		productoService.eliminarProductoPorId(id);
		return "redirect:/productos";
	}

}

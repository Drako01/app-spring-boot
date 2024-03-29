package com.example.springboot;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.model.Producto;
import com.example.springboot.model.Usuario;
import com.example.springboot.service.ProductoService;
import com.example.springboot.service.UsuarioService;

@Controller
public class HelloController {

    private final ProductoService productoService;
    private final UsuarioService usuarioService;
    
	@GetMapping("/")
    public String index(Model model) {
        model.addAttribute("imagePath", "/img/spring.png");
        model.addAttribute("pageTitle", "Bienvenidos | App Spring Boot");
        model.addAttribute("titulo", "Mi Primer App en");
        return "index";
    }
	
    public HelloController(ProductoService productoService, UsuarioService usuarioService) {
        this.productoService = productoService;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/productos")
    public String productos(Model model) {
        List<Producto> productos = productoService.obtenerTodosProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("imagePath", "/img/spring.png");
        model.addAttribute("pageTitle", "Productos | App Spring Boot");
        model.addAttribute("titulo", "Productos");
        return "productos";
    }

    

    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        List<Usuario> usuarios = usuarioService.obtenerTodosUsuarios();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("imagePath", "/img/spring.png");
        model.addAttribute("pageTitle", "Usuarios | App Spring Boot");
        model.addAttribute("titulo", "Usuarios");
        return "usuarios";
    }
    
    /*
    @GetMapping("/login")
    public String login(Model model) {
        
        model.addAttribute("imagePath", "/img/spring.png");
        model.addAttribute("pageTitle", "Login | App Spring Boot");
        model.addAttribute("titulo", "Login");
        return "login";
    }
     */
}


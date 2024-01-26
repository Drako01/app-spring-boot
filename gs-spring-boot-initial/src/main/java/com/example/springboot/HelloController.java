package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("imagePath", "img/spring.png");
        model.addAttribute("pageTitle", "Página de Inicio");
        model.addAttribute("titulo", "Mi Primer App en");
        return "index";
    }
    
    @GetMapping("/productos")
    public String otraPagina(Model model) {    	
    	model.addAttribute("imagePath", "img/spring.png");
        model.addAttribute("pageTitle", "Productos");
        model.addAttribute("titulo", "Productos");
        return "productos";
    }
}

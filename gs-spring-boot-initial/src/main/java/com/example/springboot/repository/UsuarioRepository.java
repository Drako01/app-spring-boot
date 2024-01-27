package com.example.springboot.repository;

import com.example.springboot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes definir métodos personalizados según tus necesidades
}

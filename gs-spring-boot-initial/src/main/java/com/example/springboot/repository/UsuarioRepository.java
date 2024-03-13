package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Usuario;

//UsuarioRepository.java
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByCorreoAndPassword(String correo, String password);
}

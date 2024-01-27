// src/main/java/com/example/springboot/repository/ProductoRepository.java

package com.example.springboot.repository;

import com.example.springboot.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
   
}

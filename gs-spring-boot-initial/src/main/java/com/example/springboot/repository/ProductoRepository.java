// src/main/java/com/example/springboot/repository/ProductoRepository.java

package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	@Query(value = "SELECT p FROM Producto p ORDER BY RAND()")
    List<Producto> findAllRandom();
}

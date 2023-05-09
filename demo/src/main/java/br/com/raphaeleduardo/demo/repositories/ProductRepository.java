package br.com.raphaeleduardo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphaeleduardo.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

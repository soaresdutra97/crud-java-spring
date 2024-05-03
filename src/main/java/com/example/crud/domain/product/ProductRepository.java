package com.example.crud.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findAllByActiveTrue();
}


////interface é uma classe sem implementação, como um contrato apenas com declarações. A interface do JPA cria os metodos em runtime.
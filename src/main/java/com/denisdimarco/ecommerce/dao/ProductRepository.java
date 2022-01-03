package com.denisdimarco.ecommerce.dao;

import com.denisdimarco.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

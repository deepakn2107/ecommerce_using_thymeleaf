package com.npci.thymeleaf.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.thymeleaf.entity.Product;

@Repository
public interface EcommerceRepository extends JpaRepository<Product, Integer> {

	public Optional<Product> findByNameContainsAllIgnoreCase(String name);
}

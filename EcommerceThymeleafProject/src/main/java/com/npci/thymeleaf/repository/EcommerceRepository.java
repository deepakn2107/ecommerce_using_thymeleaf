package com.npci.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.thymeleaf.entity.Product;

@Repository
public interface EcommerceRepository extends JpaRepository<Product, Integer> {

}

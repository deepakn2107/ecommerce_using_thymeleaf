package com.npci.thymeleaf.service;

import java.util.List;
import com.npci.thymeleaf.entity.Product;

public interface EcommerceService {
	
	public List<Product> findAll();
	
	public void save(Product product);

	public Product findById(Integer id);
	
	public void deleteById(Integer id);
}

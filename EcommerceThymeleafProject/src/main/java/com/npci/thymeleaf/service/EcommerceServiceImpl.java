package com.npci.thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.thymeleaf.entity.Product;
import com.npci.thymeleaf.repository.EcommerceRepository;

@Service
public class EcommerceServiceImpl implements EcommerceService  {
	
	@Autowired
	EcommerceRepository ecommRepo;
	
	@Override
	public List<Product> findAll() {
		
		return ecommRepo.findAll();
	}

	@Override
	public void save(Product product) {
		ecommRepo.save(product);
		
	}

	@Override
	public Product findById(Integer id) {
		
		Optional<Product> prod =ecommRepo.findById(id);
		
		Product product = null;
		if(prod.isPresent())
			product =prod.get();
		return product;
	}


	public void deleteById(Integer id) {
		ecommRepo.deleteById(id);
		
		
	}
	
	

}

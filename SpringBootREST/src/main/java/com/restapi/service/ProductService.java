package com.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Product;
import com.restapi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> listAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	public Product getProductById(Integer id) {
		Optional<Product> optinalProdcusts = productRepository.findById(id);
		return optinalProdcusts.get();
	}

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}

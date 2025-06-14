package org.springboot.productinventory.dao;

import java.util.List;
import java.util.Optional;

import org.springboot.productinventory.entity.Product;
import org.springboot.productinventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	private ProductRepository productRepository;

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(long id) {
		return productRepository.findById(id);
	}

	public Product updateProductById(Product product, long id) {
		return productRepository.save(product);
	}

	public boolean deleteById(long id) {
		Optional<Product> recProduct = getProductById(id);
		if (recProduct.isPresent()) {
			productRepository.delete(recProduct.get());
			return true;
		}
		return false;
	}

}

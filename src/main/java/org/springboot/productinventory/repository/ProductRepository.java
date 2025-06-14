package org.springboot.productinventory.repository;

import org.springboot.productinventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	

}

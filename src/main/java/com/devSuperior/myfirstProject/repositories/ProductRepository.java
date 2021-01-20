package com.devSuperior.myfirstProject.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devSuperior.myfirstProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}

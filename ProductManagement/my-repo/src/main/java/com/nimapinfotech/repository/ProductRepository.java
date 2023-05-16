package com.nimapinfotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimapinfotech.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

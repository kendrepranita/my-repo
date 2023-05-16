package com.nimapinfotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimapinfotech.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}

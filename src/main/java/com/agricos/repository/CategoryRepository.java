package com.agricos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agricos.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

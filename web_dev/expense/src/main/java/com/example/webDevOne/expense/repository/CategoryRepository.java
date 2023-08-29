package com.example.webDevOne.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.webDevOne.expense.model.Category;



public interface CategoryRepository extends JpaRepository<Category, Long>{
   
    Category findByName(String name);
}

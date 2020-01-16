package com.br.gerdoc.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.gerdoc.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}

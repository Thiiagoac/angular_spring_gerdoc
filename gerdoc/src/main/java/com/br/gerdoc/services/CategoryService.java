package com.br.gerdoc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.gerdoc.model.Category;
import com.br.gerdoc.respository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catRepo;
	
	public Category findCategoryById(int id) {
		Optional<Category> obj = catRepo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Category> findAll(){
		return catRepo.findAll();
	}
	
	public void insertCategory(Category obj) {
		catRepo.save(obj);
	}
	
	public void deleteCategory(int id) {
		catRepo.deleteById(id);
	}
	
	
	public void updateCategory(int id, Category obj) {
		Category newCat = findCategoryById(id);
		newCat.setDescricao(obj.getDescricao());
		newCat.setNome(obj.getNome());
		catRepo.save(newCat);
	}
	
	
}

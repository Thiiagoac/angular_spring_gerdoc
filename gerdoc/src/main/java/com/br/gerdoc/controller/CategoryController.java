package com.br.gerdoc.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.gerdoc.model.Category;
import com.br.gerdoc.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	private CategoryService catService;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public ResponseEntity<Category> findCategoryById(@PathVariable int id){
		Category obj = catService.findCategoryById(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Category>> findAllCategory(){
		List<Category> listCat = catService.findAll();
		return ResponseEntity.ok().body(listCat);
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public ResponseEntity<Void> insertCategory(@RequestBody Category obj){
		catService.insertCategory(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> updateCategory(@PathVariable int id, @RequestBody Category obj){
		catService.updateCategory(id, obj);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value ="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCategory(@PathVariable int id){
		catService.deleteCategory(id);
		return ResponseEntity.noContent().build();
	}
	
}

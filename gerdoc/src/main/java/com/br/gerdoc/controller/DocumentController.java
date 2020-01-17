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

import com.br.gerdoc.model.Document;
import com.br.gerdoc.services.DocumentService;

@RestController
@RequestMapping(value = "/document")
public class DocumentController {

	@Autowired
	private DocumentService docService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Document> findDocById(@PathVariable int id) {
		Document doc = docService.getDocById(id);
		return ResponseEntity.ok().body(doc);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Document>> findAllDocs() {
		List<Document> docs = docService.getAllDoc();
		return ResponseEntity.ok().body(docs);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insertDoc(@RequestBody Document obj) {
		docService.insertDoc(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> updateDoc(@PathVariable int id,@RequestBody Document obj){
		docService.updateDoc(id, obj);
		return ResponseEntity.noContent().build();
		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteDoc(@PathVariable int id) {
		docService.deleteDoc(id);
		return ResponseEntity.noContent().build();
	}

}

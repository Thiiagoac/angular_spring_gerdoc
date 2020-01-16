package com.br.gerdoc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.gerdoc.model.Document;
import com.br.gerdoc.respository.DocumentRepository;

@Service
public class DocumentService {
	
	@Autowired
	private DocumentRepository documentoRepo;
		
	public void insertDoc(Document obj) {
		this.documentoRepo.save(obj);
	}
	
	public Document getDocById(int id) {
		Optional<Document> obj = documentoRepo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Document> getAllDoc(){
		return this.documentoRepo.findAll();
	}
	
	public void updateDoc(int id,Document obj) {
		Document doc = getDocById(id);
		doc.setCategory(obj.getCategory());
		documentoRepo.save(doc);
	}
	
	public void deleteDoc(int id){
		this.documentoRepo.deleteById(id);
	}
	
}

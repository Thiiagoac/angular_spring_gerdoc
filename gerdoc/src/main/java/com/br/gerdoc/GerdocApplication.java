package com.br.gerdoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.gerdoc.model.Category;
import com.br.gerdoc.model.Document;
import com.br.gerdoc.respository.CategoryRepository;
import com.br.gerdoc.respository.DocumentRepository;

@SpringBootApplication
public class GerdocApplication implements CommandLineRunner{
	
	@Autowired
	private DocumentRepository docRepo;
	
	@Autowired
	private CategoryRepository catRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GerdocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category c1 = new Category(null,"cpf","imagem do meu cpf");
		catRepo.save(c1);
		Document d1 = new Document(null,"teste",c1);
		docRepo.save(d1);
	}

}

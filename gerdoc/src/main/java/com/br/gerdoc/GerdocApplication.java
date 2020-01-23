package com.br.gerdoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.br.gerdoc.model.Category;
import com.br.gerdoc.model.Document;
import com.br.gerdoc.model.User;
import com.br.gerdoc.respository.CategoryRepository;
import com.br.gerdoc.respository.DocumentRepository;
import com.br.gerdoc.respository.UserRepository;

@SpringBootApplication
public class GerdocApplication implements CommandLineRunner{
	@Autowired
	public BCryptPasswordEncoder pe;
	
	@Autowired
	private DocumentRepository docRepo;
	
	@Autowired
	private CategoryRepository catRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GerdocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category c1 = new Category(null,"cpf","imagem do meu cpf");
		catRepo.save(c1);
		Document d1 = new Document(null,"teste",c1);
		User u = new User(null,"thiago","thiago@email.com",pe.encode("123"));
		u.getDocs().add(d1);
		userRepo.save(u);

		d1.setUser(u);
		docRepo.save(d1);
	}

}

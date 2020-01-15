package com.br.gerdoc.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.gerdoc.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Integer>{

}

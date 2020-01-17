package com.br.gerdoc.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.gerdoc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

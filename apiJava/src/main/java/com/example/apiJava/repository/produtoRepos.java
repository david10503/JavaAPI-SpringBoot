package com.example.apiJava.repository;

import com.example.apiJava.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepos extends JpaRepository<Produto, Long> {
}
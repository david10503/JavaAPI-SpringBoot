package com.example.apiJava.service;

import com.example.apiJava.model.Produto;
import org.springframework.stereotype.Service;
import com.example.apiJava.repository.produtoRepos;

import java.util.List;

@Service
public class produtoService {

    private final produtoRepos repository;

    public produtoService(produtoRepos repository){
        this.repository = repository;
    }

    public List<Produto> listarProdutos() {
        return  repository.findAll();
    }
}

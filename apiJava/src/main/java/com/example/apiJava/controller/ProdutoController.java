package com.example.apiJava.controller;

import com.example.apiJava.model.Produto;
import com.example.apiJava.service.produtoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    private final produtoService service;

    public ProdutoController(produtoService service) {
        this.service = service;
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return service.listarProdutos();
    }
}
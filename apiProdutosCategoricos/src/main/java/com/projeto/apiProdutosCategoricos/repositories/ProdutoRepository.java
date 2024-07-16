package com.projeto.apiProdutosCategoricos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apiProdutosCategoricos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}


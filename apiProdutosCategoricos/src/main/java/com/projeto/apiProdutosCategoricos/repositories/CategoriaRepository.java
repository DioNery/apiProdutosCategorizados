package com.projeto.apiProdutosCategoricos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apiProdutosCategoricos.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

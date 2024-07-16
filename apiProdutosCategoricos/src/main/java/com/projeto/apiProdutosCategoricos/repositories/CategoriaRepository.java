package com.projeto.apiProdutosCategoricos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apiProdutosCategoricos.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByNome(String nome);
}

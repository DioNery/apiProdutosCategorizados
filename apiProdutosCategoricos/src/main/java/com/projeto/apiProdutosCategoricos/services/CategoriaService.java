package com.projeto.apiProdutosCategoricos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.apiProdutosCategoricos.models.Categoria;
import com.projeto.apiProdutosCategoricos.repositories.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodas() {
        List<Categoria> categorias = categoriaRepository.findAll();
        categorias.forEach(categoria -> categoria.getProdutos().size()); 
        return categorias;
    }

    public Categoria buscarPorId(Long id) {
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);
        if (optionalCategoria.isPresent()) {
            Categoria categoria = optionalCategoria.get();
            categoria.getProdutos().size();
            return categoria;
        }
        return null;
    }
    public Categoria buscarPorNome(String nome) {
        Optional<Categoria> optionalCategoria = categoriaRepository.findByNome(nome);
        if (optionalCategoria.isPresent()) {
            Categoria categoria = optionalCategoria.get();
            categoria.getProdutos().size();
            return categoria;
        }
        return null;
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}

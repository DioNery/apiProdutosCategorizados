package com.projeto.apiProdutosCategoricos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.apiProdutosCategoricos.models.Produto;
import com.projeto.apiProdutosCategoricos.repositories.ProdutoRepository;
import com.projeto.apiProdutosCategoricos.repositories.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }
    public Produto buscarPorNome(String nome) {
        Optional<Produto> optionalProduto = produtoRepository.findByNome(nome);
        if (optionalProduto.isPresent()) {
            Produto produto = optionalProduto.get();
            return produto;
        }
        return null;
    }

    public Produto salvar(Produto produto) {
        // Verifica se a categoria associada ao produto existe no banco de dados
        if (produto.getCategoria() != null && produto.getCategoria().getId() != null) {
            Long categoriaId = produto.getCategoria().getId();
            if (!categoriaRepository.existsById(categoriaId)) {
                throw new RuntimeException("Categoria não encontrada com o ID: " + categoriaId);
            }
        } else {
            throw new RuntimeException("É necessário associar uma categoria válida ao produto.");
        }
        
        return produtoRepository.save(produto);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}

package com.dh.aula32.integradorax.service;

import com.dh.aula32.integradorax.model.Produto;
import com.dh.aula32.integradorax.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> buscar(Integer id) {
        return produtoRepository.findById(id);
    }

    @Override
    public void salvar(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void deletar(Integer id) {
        produtoRepository.deleteById(id);
    }

}

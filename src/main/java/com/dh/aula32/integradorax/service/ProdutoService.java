package com.dh.aula32.integradorax.service;

import com.dh.aula32.integradorax.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    List<Produto> buscarTodos();
    Optional<Produto> buscar(Integer id);
    void salvar(Produto produto);
    void deletar(Integer id);

}

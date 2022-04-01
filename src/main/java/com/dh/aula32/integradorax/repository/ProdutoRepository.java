package com.dh.aula32.integradorax.repository;

import com.dh.aula32.integradorax.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    //

}

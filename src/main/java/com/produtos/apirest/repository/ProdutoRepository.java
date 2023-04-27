package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository - persistencia no banco de dados
 * Métodos já são feitos: save/delete/findAll/findById
*/
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    //Método personalizado para procurar um produto por Id
    Produto findById(long id);
}

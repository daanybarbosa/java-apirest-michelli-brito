package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller
 * Classe que irá receber as requisições HTTP
 */

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    //ponto de injeção - métodos tenham acesso ao DB
    @Autowired
    ProdutoRepository produtoRepository;

    // Método GET - Irá listar todos os produtos salvos no DB
    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    // Método GET - Irá listar um unico produto
    @GetMapping("/produto/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }

    // Método POST - Salvar um determinado produto
    // @RequestBody - Irá receber as informações no corpo da requisição
    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    // Método DELETE - Deletar um determinado produto
    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    // Método PUT - Atualizar um produto
    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}

package br.comv.vitrinevirtual.vitrine.dao;

import org.springframework.data.repository.CrudRepository;

import br.comv.vitrinevirtual.vitrine.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {

}

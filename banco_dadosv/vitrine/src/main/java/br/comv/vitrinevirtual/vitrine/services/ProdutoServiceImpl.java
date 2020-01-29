package br.comv.vitrinevirtual.vitrine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import br.comv.vitrinevirtual.vitrine.dao.ProdutoRepo;
import br.comv.vitrinevirtual.vitrine.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired
	private ProdutoRepo repo;
	
	@Override
	public List<Produto> recuperarTodos(){
		
		/*isso corresponde a digitar no banco de dados select* from tbl_produto inner join tbldepartamento on tbl_produto.departamento_id
		 * = departamento_id*/
		return(List<Produto>)repo.findAll();
	}

	
	@Override
	public Produto recuperarPorId(int id) {
		return repo.findById(id).get();
	}
}

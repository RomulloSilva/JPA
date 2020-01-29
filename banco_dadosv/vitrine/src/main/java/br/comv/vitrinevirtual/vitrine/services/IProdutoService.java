package br.comv.vitrinevirtual.vitrine.services;

import java.util.List;

import br.comv.vitrinevirtual.vitrine.model.Produto;

public interface IProdutoService {
	
	public List<Produto> recuperarTodos();
		public Produto recuperarPorId(int id);
		
	

}

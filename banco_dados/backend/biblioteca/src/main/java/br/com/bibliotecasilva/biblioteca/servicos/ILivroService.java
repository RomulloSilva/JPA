package br.com.bibliotecasilva.biblioteca.servicos;

import br.com.bibliotecasilva.biblioteca.model.Livro;

public interface ILivroService {
	
	public void gravarLivroNoBanco(Livro livro);
	public void atualizarLivroNoBanco(Livro livro);
	public Livro recuperarLivroPorId(int id);

}

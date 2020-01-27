package br.com.bibliotecasilva.biblioteca.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bibliotecasilva.biblioteca.dao.ILivroBD;
import br.com.bibliotecasilva.biblioteca.model.Livro;

@Component
public class ServicoLivro implements ILivroService {
	
	@Autowired  //indica que o gerenciamento desse objeto é por conta do SpringBoot
	ILivroBD repo; //repo = repositório (uma alusão ao banco de dados)
	
	public void gravarLivroNoBanco(Livro livro) {
		try {
			repo.save(livro);
		}catch(Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno");
		}
	}
	public void atualizarLivroNoBanco(Livro livro) {
		try {
			repo.save(livro);
		}catch(Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno no banco");
		}
	}
	public Livro recuperarLivroPorId(int id) {
		return repo.findById(id).get();
		
	}
	

}

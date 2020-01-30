package br.com.universidadeba.universidade.service;

import java.util.List;

import br.com.universidadeba.universidade.modell.Aluno;

public interface IAlunoService {
	
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorRa(int ra);

}

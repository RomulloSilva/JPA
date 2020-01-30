package br.com.universidadeba.universidade.service;

import java.util.List;

import br.com.universidadeba.universidade.modell.Curso;

public interface ICursoService {

	public List<Curso> buscarTodos();
	public Curso buscarPorRc(int rc);
	public void addNovoCurso (Curso curso);

	
	
	
}

package br.com.universidadeba.universidade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.universidadeba.universidade.dao.CursoRepo;
import br.com.universidadeba.universidade.modell.Curso;




@Component
public class CursoService implements ICursoService  {
	
	@Autowired
	public CursoRepo repo;
	
	
	@Override
	public void addNovoCurso(Curso curso) {
		repo.save(curso);
	}
	
	@Override
	public Curso buscarPorRc(int rc) {
		return repo.findById(rc).get();
	}
	
	@Override
	public List<Curso> buscarTodos(){
		return (List<Curso>)repo.findAll();
	}

	

}

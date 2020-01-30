package br.com.universidadeba.universidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.universidadeba.universidade.dao.AlunoRepo;
import br.com.universidadeba.universidade.modell.Aluno;

@Component
public class AlunoService implements IAlunoService {
	
	@Autowired
	private AlunoRepo repo;
	
	@Override
	public List<Aluno> recuperarTodos(){
		return(List<Aluno>)repo.findAll();
	}
	
	@Override
	public Aluno recuperarPorRa(int ra) {
		return repo.findById(ra).get();
	}
	
	@Override
	public void matricularAluno(Aluno aluno) {
		repo.save(aluno);
	}

}

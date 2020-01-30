package br.com.universidadeba.universidade.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.universidadeba.universidade.modell.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer> {

}

package br.com.bibliotecasilva.biblioteca.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.bibliotecasilva.biblioteca.model.Livro;

public interface ILivroBD extends CrudRepository<Livro, Integer> {

}

package br.com.bibliotecasilva.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibliotecasilva.biblioteca.model.Livro;
import br.com.bibliotecasilva.biblioteca.servicos.ILivroService;

@RestController
@CrossOrigin("*")
public class LivroController {
	
	@Autowired
	private ILivroService servico;
	
	
	@GetMapping("/catalogo/{id}")
	public ResponseEntity<Livro> getLivroPeloId(@PathVariable int id) {
		return null;
		
		
	}
	
	@PostMapping("/livro/novo")
	public ResponseEntity<Livro> inserirNovoLivro(@RequestBody Livro livro){
		try {
			servico.gravarLivroNoBanco(livro);
			return ResponseEntity.ok(livro);
		}catch (Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	
	@PutMapping("/livro/alterar")
	public ResponseEntity<Livro> atualizarLivro(@RequestBody Livro livro){
		return null;
	}
	
	
}

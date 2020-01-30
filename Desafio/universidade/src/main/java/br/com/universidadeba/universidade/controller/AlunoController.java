package br.com.universidadeba.universidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.universidadeba.universidade.modell.Aluno;
import br.com.universidadeba.universidade.service.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	public IAlunoService servico;
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	
	@GetMapping("?aluno/{ra}")
	public ResponseEntity<Aluno> mostrarPeloRa(@PathVariable int ra){
		Aluno a = servico.recuperarPorRa(ra);
		if(a!=null) {
			return ResponseEntity.ok(a);
		}else {return ResponseEntity.notFound().build();}
	}

}

	
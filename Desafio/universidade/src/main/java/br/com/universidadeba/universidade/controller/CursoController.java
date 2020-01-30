package br.com.universidadeba.universidade.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.universidadeba.universidade.modell.Curso;
import br.com.universidadeba.universidade.service.ICursoService;




@RestController
@CrossOrigin("*")
public class CursoController {

	@Autowired
	private ICursoService servico;
	
	@PostMapping("/curso/novo")
	public ResponseEntity<Curso> incluirNovo(@RequestBody Curso curso){
		
		servico.addNovoCurso(curso);
		return ResponseEntity.ok(curso);
		
	}
	
	@GetMapping("/curso/todos")
	public ResponseEntity<List<Curso>> listarTodos(){
		return ResponseEntity.ok(servico.buscarTodos());
	}
	
	@GetMapping("/curso/{id}")
	public ResponseEntity<Curso> detalhesCurso(@PathVariable int rc){
		Curso curso = servico.buscarPorRc(rc);
		if(curso != null) {
			return ResponseEntity.ok(curso);
		}else {return ResponseEntity.notFound().build();
		}
	}
	
	
	
}

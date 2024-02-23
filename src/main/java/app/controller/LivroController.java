package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Livros;
import app.service.LivroService;

@RestController
@RequestMapping("/api/livro")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Livros livro) {
		
		try {
			
			String mensagem = this.livroService.Save(livro);
			return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Deu esse erro aqui: "+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update@RequestBody( Livro livro, @PathVariable int id){
		
	}
	
}

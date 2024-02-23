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

import app.entity.Autor;
import app.service.AutorService;

@RestController
	@RequestMapping("/api/Autor")
public class AutorController {

	
	@Autowired
	private AutorService autorService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Autor autor) {
		
		try {
			
			String mensagem = this.autorService.save(autor);
			return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Erro: "+e.getMessage(), HttpStatus.BAD_REQUEST);
			
		}
		
	}
	

	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody Autor autor, @PathVariable int id) {
		
		try {
			
			String mensagem = this.autorService.update(id, autor);
			return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Deu esse erro aqui: "+e.getMessage(), HttpStatus.BAD_REQUEST);
			
		}
		
	}
	
}

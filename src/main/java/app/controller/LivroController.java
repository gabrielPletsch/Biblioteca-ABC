package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livro")
public class LivroController {

	@Autowired
	private BiblioteService bibliotecaService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Livro livro) {
		
		try {
			
			String mensagem = this.carroService
		}
	}
	
	
}

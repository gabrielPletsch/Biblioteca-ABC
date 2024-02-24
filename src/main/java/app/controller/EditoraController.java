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

import app.entity.Editora;
import app.service.EditoraService;

@RestController
@RequestMapping("/api/Editora")
public class EditoraController {

		@Autowired
		private EditoraService editoraService;

		@PostMapping("/save")
		public ResponseEntity<String> save(@RequestBody Editora editora) {

			try {

				String mensagem = this.editoraService.Save(editora);
				return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);

			} catch (Exception e) {

				return new ResponseEntity<String>("Deu esse erro aqui: " + e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}

		@PutMapping("/update/{idUpdate}")
		public ResponseEntity<String> update(@RequestBody Editora editora, @PathVariable int id) {

			try {

				String mensagem = this.editoraService.update(id, editora);
				return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);

			} catch (Exception e) {

				return new ResponseEntity<String>("Erro: " + e.getMessage(), HttpStatus.BAD_REQUEST);

			}

		}

}

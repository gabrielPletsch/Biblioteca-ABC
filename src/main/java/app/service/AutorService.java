package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Autor;
import app.repository.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;

	public String save(Autor autor) {
		this.autorRepository.save(autor);
		return autor.getNomeAutor() + " autor salvo com sucesso";
	}

	public List<Autor> listAll() {
		return this.autorRepository.findAll();
	}

	public Autor findById(long idAutor) {

		Autor autor = this.autorRepository.findById(idAutor).get();
		return autor;

	}

	public String update(long idAutor, Autor autor) {
		autor.setIdAutor(idAutor);
		this.autorRepository.save(autor);
		return autor.getNomeAutor() + " registro atualizado";
	}

	public String delete(long idAutor) {

		this.autorRepository.deleteById(idAutor);
		return "Registro deletado";

	}
}

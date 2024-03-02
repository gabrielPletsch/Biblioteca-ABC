package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Biblioteca;
import app.repository.BibliotecaRepository;

@Service
public class BibliotecaService {
	


	@Autowired
	private BibliotecaRepository bibliotecaRepository;

	public String save(Biblioteca biblioteca) {
		this.bibliotecaRepository.save(biblioteca);
		return biblioteca.getNome() + " salva com sucesso";
	}

	public List<Biblioteca> listAll() {
		return this.bibliotecaRepository.findAll();
	}

	public String update(long id, Biblioteca biblioteca) {
		biblioteca.setId(id);
		this.bibliotecaRepository.save(biblioteca);
		return biblioteca.getNome() + " registro atualizado";
	}


	public Biblioteca findById(long idBiblioteca) {

		Biblioteca biblioteca = this.bibliotecaRepository.findById(idBiblioteca).get();
		return biblioteca;

	}

	public String delete(long idBiblioteca) {

		this.bibliotecaRepository.deleteById(idBiblioteca);

		return  "Dados deletados";

	

	}

}

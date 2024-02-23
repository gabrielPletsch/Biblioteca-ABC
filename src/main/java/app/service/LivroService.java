package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livros;

@Service

public class LivroService {
	List<Livros> lista = new ArrayList<>();
	
	public String Save(Livros livro) {
		lista.add(livro);
		return livro.getNome()+ "Foi salvo com sucesso!!";
	}
}
	
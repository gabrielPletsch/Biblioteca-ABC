package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livro;

@Service

public class LivroService {
	List<Livro> lista = new ArrayList<>();
	
	public String Save(Livro livro) {
		lista.add(livro);
		return livro.getNome()+ "Foi salvo com sucesso!!";
	}
}
	
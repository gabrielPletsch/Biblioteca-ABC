package app.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Livro;
import app.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public String save(Livro livro) {
		this.livroRepository.save(livro);
		return livro.getTitulo()+ " Salvo com sucesso";
	}

	public String update(long id, Livro livro) {
		livro.setId(id);
		this.livroRepository.save(livro);
		return "Livro não encontrado para alterar";
	}

	public List<livro> listAll(){
		return this.livroRepository.findAll();
	}

	public Livro findById(long idLivro) {

		Livro livro = this.livroRepository.findById(idLivro).get();
		return livro;

	}

	public String delete(long idLivro) {
		this.livroRepository.deleteById(idLivro);
		return "Não encontrado para deletar";

	}
}
	
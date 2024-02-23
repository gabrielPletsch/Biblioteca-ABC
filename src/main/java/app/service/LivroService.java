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
		return livro.getTitulo()+ "Foi salvo com sucesso!!";
	}
	
	
	public String update(long id, Livro livro) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, livro);
					return livro.getTitulo()+ "Sucesso!!";
				}
			}

		return "Não foi possivel encontrar o livro escolhido";
	}
	
	public List<Livro> listAll(){

		Livro livro = new Livro(1, "0123456789", "HarryPotter","ABCDEFGHIJK",1997,234);
		Livro livro2 = new Livro(2, "056832495","SenhorDosAneis", "HIJKLMNO",1954,432);
		Livro livro3 = new Livro(3, "40028922","StarWars", "PQRSTUVWXYZ", 1977, 324);

		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);

		return lista;

	}
	
	public Livro findById(long idLivro) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idLivro) {
					return lista.get(i);
				}
			}

		return null;
	}
	
	public String delete(long idLivro) {

	
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idLivro) {
					lista.remove(lista.get(i));
					return "Apagado";
				}
			}

		return "Não encontrado para deletar";

	}

}
	
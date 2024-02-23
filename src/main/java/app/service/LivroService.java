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
		Livro livro3 = new Livro(3, "400289223","StarWars", "PQRSTUVWXYZ", 1977, 324);
		Livro livro4 = new Livro(4, "902345345","StarTrek", "SDAFSDFFD",1967, 243);
		Livro livro5 = new Livro(5, "532346433","HungerGames", "FDSOSDFG", 2008, 324);

		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);
		lista.add(livro4);
		lista.add(livro5);

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
	
	public boolean delete(long idLivro) {

		
		lista = this.listAll();

		if(lista != null)
			for(Livro livro : this.lista) {
				if(livro.getId() == idLivro) {
					this.lista.remove(livro);
					return true;
				}
			}

		return false;

	}


}
	
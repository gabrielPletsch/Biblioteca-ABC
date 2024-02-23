package app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import app.entity.Carro;
import app.entity.Livro;

@Service
public class LivroService {
	List<Livro> lista = new ArrayList<>();
	
	public String Save(Livro livro) {
		lista.add(livro);
		return livro.getNome()+ "Foi salvo com sucesso!!";
	}
	
	
	public String update(long id, Livro livro) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, livro);
					return lista.getNome()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}
	
	public List<Livro> listAll(){

		Livro livro = new livro(1, "HarryPotter", "6452423535");
		Livro livro2 = new livro(2, "SenhorDosAneis", "53434253");
		Livro livro3 = new livro(3, "StarWars", "45 9903243254");

		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);

		return lista;

	}

}
	
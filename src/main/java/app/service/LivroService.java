package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.LivroEntity;

@Service
public class LivroService {
	List<LivroEntity> lista = new ArrayList<>();
	
	public String Save(LivroEntity livroEntity) {
		lista.add(livroEntity);
		return livroEntity.getTitulo()+ "Foi salvo com sucesso!!";
	}
	
	
	public String update(long id, LivroEntity livroEntity) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, livroEntity);
					return livroEntity.getTitulo()+ "Sucesso!!";
				}
			}

		return "Não foi possivel encontrar o livro escolhido";
	}
	
	public List<LivroEntity> listAll(){

		LivroEntity livroEntity = new LivroEntity(1, "0123456789", "HarryPotter","ABCDEFGHIJK",1997,234);
		LivroEntity livro2 = new LivroEntity(2, "056832495","SenhorDosAneis", "HIJKLMNO",1954,432);
		LivroEntity livro3 = new LivroEntity(3, "400289223","StarWars", "PQRSTUVWXYZ", 1977, 324);
		LivroEntity livro4 = new LivroEntity(4, "902345345","StarTrek", "SDAFSDFFD",1967, 243);
		LivroEntity livro5 = new LivroEntity(5, "532346433","HungerGames", "FDSOSDFG", 2008, 324);

		lista.add(livroEntity);
		lista.add(livro2);
		lista.add(livro3);
		lista.add(livro4);
		lista.add(livro5);

		return lista;

	}
	
	public LivroEntity findById(long idLivro) {

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
	
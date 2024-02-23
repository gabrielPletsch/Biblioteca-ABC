package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Autor;


@Service
public class AutorService {
	List<Autor> lista = new ArrayList<>();

	public String save(Autor autor) {
		lista.add(autor);
		return autor.getNome()+ " salvo com sucesso";
	}

	public String update(long id, Autor autor) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, autor);
					return autor.getNome()+ " alterado com sucesso";
				}
			}

		return "Nao encontrado";
	}
	
	public List<Autor> listAll(){

		Autor autor = new Autor(1, "AAA", "842342", 45);
		Autor autor2 = new Autor(2, "ABC", "5432342", 34);
		Autor autor3 = new Autor(3, "DDD", "234234", 39);
		Autor autor4 = new Autor(4, "DDD", "5347453", 43);

		lista.add(autor);
		lista.add(autor2);
		lista.add(autor3);
		lista.add(autor4);

		return lista;

	}
	
	public Autor findById(long idAutor) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					return lista.get(i);
				}
			}

		return null;

	}

	public boolean delete(long idAutor) {

		
		lista = this.listAll();

		if(lista != null)
			for(Autor autor : this.lista) {
				if(autor.getId() == idAutor) {
					this.lista.remove(autor);
					return true;
				}
			}

		return false;

	}
}



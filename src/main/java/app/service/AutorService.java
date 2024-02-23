package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.AutorEntity;

@Service
public class AutorService {
	List<AutorEntity> lista = new ArrayList<>();

	public String save(AutorEntity autorEntity) {
		lista.add(autorEntity);
		return autorEntity.getNome()+ " salvo com sucesso";
	}

	public String update(long id, AutorEntity autorEntity) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, autorEntity);
					return autorEntity.getNome()+ " alterado com sucesso";
				}
			}

		return "Nao encontrado";
	}
	
	public List<AutorEntity> listAll(){

		AutorEntity autorEntity = new AutorEntity(1, "AAA", "842342", 45);
		AutorEntity autor2 = new AutorEntity(2, "ABC", "5432342", 34);
		AutorEntity autor3 = new AutorEntity(3, "DDD", "234234", 39);
		AutorEntity autor4 = new AutorEntity(4, "DDD", "5347453", 43);

		lista.add(autorEntity);
		lista.add(autor2);
		lista.add(autor3);
		lista.add(autor4);

		return lista;

	}
	
	public AutorEntity findById(long idAutor) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idAutor) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Não há nada para deletar";

		}
	}



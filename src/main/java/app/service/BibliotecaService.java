package app.service;

import java.util.ArrayList;
import java.util.List;

import app.entity.BibliotecaEntity;



public class BibliotecaService {
	List<BibliotecaEntity> lista = new ArrayList<>();

	public String save(BibliotecaEntity bibliotecaEntity) {
		lista.add(bibliotecaEntity);
		return bibliotecaEntity.getNome()+ " salvo com sucesso";
	}

	public String update(long id, BibliotecaEntity bibliotecaEntity) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, bibliotecaEntity);
					return	bibliotecaEntity.getNome()+ " alterado com sucesso";
				}
			}

		return "Nao ha nada para alterar";
	}
	public List<BibliotecaEntity> listAll(){

		BibliotecaEntity bibliotecaEntity = new BibliotecaEntity(1, "ABCDEF", "7532478");
		BibliotecaEntity biblioteca2 = new BibliotecaEntity(2, "OSFDG", "6453563");
		BibliotecaEntity biblioteca3 = new BibliotecaEntity(3, "HFHGF", "57564643");
		BibliotecaEntity biblioteca4 = new BibliotecaEntity(4, "OASDAOF", "90234523");
		BibliotecaEntity biblioteca5 = new BibliotecaEntity(5, "FSOSDF", "53234951");

		lista.add(bibliotecaEntity);
		lista.add(biblioteca2);
		lista.add(biblioteca3);
		lista.add(biblioteca4);
		lista.add(biblioteca5);

		return lista;

	}
	
	public BibliotecaEntity findById(long idBiblioteca) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idBiblioteca) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idBiblioteca) {

		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idBiblioteca) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Não encontrado";

	}
	
}

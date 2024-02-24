package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Biblioteca;

@Service
public class BibliotecaService {
	List<Biblioteca> lista = new ArrayList<>();

	public String save(Biblioteca biblioteca) {
		lista.add(biblioteca);
		return biblioteca.getNome() + " salvo com sucesso";
	}

	public String update(long id, Biblioteca biblioteca) {

		lista = this.listAll();

		if (lista != null)
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getId() == id) {
					lista.set(i, biblioteca);
					return biblioteca.getNome() + " alterado com sucesso";
				}
			}

		return "Nao ha nada para alterar";
	}

	public List<Biblioteca> listAll() {

		Biblioteca biblioteca = new Biblioteca(1, "ABCDEF", "7532478");
		Biblioteca biblioteca2 = new Biblioteca(2, "OSFDG", "6453563");
		Biblioteca biblioteca3 = new Biblioteca(3, "HFHGF", "57564643");
		Biblioteca biblioteca4 = new Biblioteca(4, "OASDAOF", "90234523");
		Biblioteca biblioteca5 = new Biblioteca(5, "FSOSDF", "53234951");

		lista.add(biblioteca);
		lista.add(biblioteca2);
		lista.add(biblioteca3);
		lista.add(biblioteca4);
		lista.add(biblioteca5);

		return lista;

	}

	public Biblioteca findById(long idBiblioteca) {

		lista = this.listAll();

		if (lista != null)
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getId() == idBiblioteca) {
					return lista.get(i);
				}
			}

		return null;

	}

	public boolean delete(long idBiblioteca) {

		lista = this.listAll();

		if (lista != null)
			for (Biblioteca biblioteca : this.lista) {
				if (biblioteca.getId() == idBiblioteca) {
					this.lista.remove(biblioteca);
					return true;
				}
			}

		return false;

	}

}

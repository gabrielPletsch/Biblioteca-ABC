package app.service;

import java.util.ArrayList;
import java.util.List;

import app.entity.Editora;
import app.entity.Livro;

public class EditoraService {
	List<Editora> lista = new ArrayList<>();

	public String Save(Editora editora) {
		lista.add(editora);
		return editora.getNome() + "Foi salvo com sucesso!!";
	}

	public String update(long id, Editora editora) {

		lista = this.listAll();

		if (lista != null)
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getId() == id) {
					lista.set(i, editora);
					return editora.getNome() + "Sucesso!!";
				}
			}

		return "Nao foi possivel encontar a editora";
	}

	public List<Editora> listAll() {

		Editora editora = new Editora(1, "AAAAAAAA", "HarryPotter", "111111");
		Editora editora2 = new Editora(2, "BBBBBBB", "SenhorDosAneis", "222222");
		Editora editora3 = new Editora(3, "CCCCCCC", "StarWars", "3333333");
		Editora editora4 = new Editora(4, "DDDDDDD", "StarTrek", "4444444");
		Editora editora5 = new Editora(5, "EEEEEEE", "HungerGames", "5555555");

		lista.add(editora);
		lista.add(editora2);
		lista.add(editora3);
		lista.add(editora4);
		lista.add(editora5);

		return lista;
	}

	public Editora findById(long idEditora) {

		lista = this.listAll();

		if (lista != null)
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getId() == idEditora) {
					return lista.get(i);
				}
			}

		return null;
	}

	public boolean delete(long idEditora) {

		lista = this.listAll();

		if (lista != null)
			for (Editora editora : this.lista) {
				if (editora.getId() == idEditora) {
					this.lista.remove(editora);
					return true;
				}
			}

		return false;

	}

}

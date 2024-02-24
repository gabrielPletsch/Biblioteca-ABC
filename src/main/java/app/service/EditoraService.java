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

			return "Não foi possivel encontrar o livro escolhido";
		}

		public List<Editora> listAll() {

			Editora editora = new Editora(1, "0123456789", "HarryPotter", "ABCDEFGHIJK");
			Editora editora2 = new Editora(2, "056832495", "SenhorDosAneis", "HIJKLMNO");
			Editora editora3 = new Editora(3, "400289223", "StarWars", "PQRSTUVWXYZ");
			Editora editora4 = new Editora(4, "902345345", "StarTrek", "SDAFSDFFD");
			Editora editora5 = new Editora(5, "532346433", "HungerGames", "FDSOSDFG");

			lista.add(editora);
			lista.add(editora2);
			lista.add(editora3);
			lista.add(editora4);
			lista.add(editora5);

			return lista;
		}
		
}

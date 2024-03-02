package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Editora;
import app.repository.EditoraRepository;

@Service
public class EditoraService {

	List<Editora> lista = new ArrayList<>();

	@Autowired
	private EditoraRepository editoraRepository;

	public String save(Editora editora) {
		this.editoraRepository.save(editora);
		return editora.getNomeEditora() + " editora salvo com sucesso";
	}

	public List<Editora> listAll() {
		return this.editoraRepository.findAll();
	}

	public Editora findById(long idEditora) {

		Editora editora = this.editoraRepository.findById(idEditora).get();
		return editora;

	}

	public String update(long idEditora, Editora editora) {
		editora.setIdEditora(idEditora);
		this.editoraRepository.save(editora);
		return editora.getNomeEditora() + " Editora atualizada";
	}

	public String delete(long idEditora) {
		this.editoraRepository.deleteById(idEditora);
		return "Editora deletada";
	}

}

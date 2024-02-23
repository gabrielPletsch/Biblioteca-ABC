package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class AutorEntity {
	
	private long id;
	private String nome;
	private String cpf;
	private int idade;
}

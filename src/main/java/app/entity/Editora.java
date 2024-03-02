package app.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long idEditora;
	String nomeEditora;
	String enderecoEditora;
	String telefoneEditora;

}

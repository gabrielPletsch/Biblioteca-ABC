package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long idLivro;
	
	private String issn;
	@NotNull
	private String titulo;
	private String sinopse;
	private int ano;
	private int num_pag;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JsonIgnoreProperties("livro")
	private Biblioteca biblioteca;
	
}

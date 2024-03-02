package app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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

public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAutor;
	@NotNull(message = "O nome do autor nao deve ser nulo")
	private String nomeAutor;
	private String cpfAutor;
	private int idadeAutor;

	
	
}

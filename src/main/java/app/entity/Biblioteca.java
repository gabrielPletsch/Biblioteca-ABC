package app.entity;

import java.util.List;

<<<<<<< HEAD
import java.util.List;

=======
import jakarta.persistence.Entity;
>>>>>>> Develop
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructors
@NoArgsConstructor
@Entity

public class Biblioteca {
<<<<<<< HEAD

=======
>>>>>>> Develop
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String nome;
	private String telefone;
<<<<<<< HEAD
	
=======

>>>>>>> Develop
	@OneToMany(mappedBy = "biblioteca")
	private List<Livro> livro;
}

package model;
import java.io.Serializable;
import javax.persistence.*;


@Entity	
@Table(name = "user")
public class User implements Serializable {
	@Id //tramite questo noi andiamo a decide quale colonna deve avere la chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "data di nascita")
	private String data_nascita;
}

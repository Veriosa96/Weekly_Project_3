package model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name ="prestito")
public class Prestito implements Serializable {
	@Id
	@Column(name = "Elemento prestato")
	private String elementoPrestato;
}

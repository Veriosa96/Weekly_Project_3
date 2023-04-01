package model;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="libro")
public class Libro implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codice_isbn")
	private long id;
	@Column(nullable=false)
	private String titolo;
	@Column(nullable = false)
	private String Autore;
	@Column(nullable = false)
	private String Genere;
	@Column(nullable=false)
	private String anno_pubblicazione;
	@Column(nullable=false, unique = true)
	private String numero_pagine;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getanno_pubblicazione() {
		return anno_pubblicazione;
	}
	public void setLastname(String anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}
	public String getnumero_pagine() {
		return numero_pagine;
	}
	public void setEmail(String numero_pagine) {
		this.numero_pagine = numero_pagine;
	}
	
	public String getAutore() {
		return Autore;
	}
	public void setAutore(String autore) {
		Autore = autore;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", Autore=" + Autore + ", Genere=" + Genere
				+ ", anno_pubblicazione=" + anno_pubblicazione + ", numero_pagine=" + numero_pagine + "]";
	}
	
	
	
}
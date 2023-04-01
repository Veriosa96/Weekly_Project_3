package model;

import java.io.Serializable;
import javax.persistence.*;


	@Entity
	@Table(name="rivista")
	public class Rivista implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="codice_isbn")
		private long id;
		@Column(nullable=false)
		private String titolo;
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
		public String getAnno_pubblicazione() {
			return anno_pubblicazione;
		}
		public void setAnno_pubblicazione(String anno_pubblicazione) {
			this.anno_pubblicazione = anno_pubblicazione;
		}
		public String getNumero_pagine() {
			return numero_pagine;
		}
		public void setNumero_pagine(String numero_pagine) {
			this.numero_pagine = numero_pagine;
		}
		@Override
		public String toString() {
			return "Rivista [id=" + id + ", titolo=" + titolo + ", anno_pubblicazione=" + anno_pubblicazione
					+ ", numero_pagine=" + numero_pagine + "]";
		}	
}
	

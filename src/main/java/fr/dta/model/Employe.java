package fr.dta.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "employe_seq")
public class Employe implements IoEntity {

	private static final long serialVersionUID = 8244047998245894909L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employe_seq")
	private Long identifiant;
	@Column
	private String prenom;
	@Column
	private String nom;
	@Column
	private String numSecu;
	@Column
	private BigDecimal salaire;
	@Column
	private LocalDate dateEmbauche;

	@ManyToOne
	private Entreprise entreprise;

	public Employe(Long identifiant, String prenom, String nom, String numSecu, BigDecimal salaire,
			LocalDate dateEmbauche) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.numSecu = numSecu;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}

	public Employe(String prenom, String nom, String numSecu, BigDecimal salaire, LocalDate dateEmbauche) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.numSecu = numSecu;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getNumSecu() {
		return numSecu;
	}

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	@Override
	public String toString() {
		return "Employe [identifiant=" + identifiant + ", prenom=" + prenom + ", nom=" + nom + ", numSecu=" + numSecu
				+ ", salaire=" + salaire + ", dateEmbauche=" + dateEmbauche + "]";
	}

	@Override
	public Long getId() {
		return this.identifiant;
	}

	@Override
	public void setId(Long id) {
		this.identifiant = id;

	}

}

package fr.dta.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employe {
	private Long identifiant;
	private String prenom;
	private String nom; 
	private String numSecu;
	private BigDecimal salaire;
	private LocalDate dateEmbauche;
	public Employe(Long identifiant, String prenom, String nom, String numSecu, BigDecimal salaire, LocalDate dateEmbauche) {
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

	public long getIdentifiant() {
		return identifiant;
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
	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
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
	
	

}

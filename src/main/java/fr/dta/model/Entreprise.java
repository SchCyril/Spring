package fr.dta.model;

import java.util.List;

public class Entreprise {
	
	private Long identifiant;
	private String nom;
	
	private List<Employe> employes;

	public Entreprise(Long identifiant, String nom, List<Employe> employes) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.employes = employes;
	}

	public Long getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public List<Employe> getEmployes() {
		return employes;
	}
	
	

}

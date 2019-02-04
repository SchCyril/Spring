package fr.dta.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "entreprise_seq")
public class Entreprise implements IoEntity {

	private static final long serialVersionUID = 7302861006788509628L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entreprise_seq")
	private Long identifiant;
	@Column
	private String nom;

	@OneToMany(mappedBy = "entreprise")
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

	@Override
	public Long getId() {
		return this.identifiant;
	}

	@Override
	public void setId(Long id) {
		this.identifiant = id;
	}

}

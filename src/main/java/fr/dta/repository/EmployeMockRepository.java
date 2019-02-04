package fr.dta.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import fr.dta.model.Employe;

@Repository
public class EmployeMockRepository implements EmployeRepository {

	private List<Employe> employes;

	public EmployeMockRepository() {
		this.employes = new ArrayList<Employe>();
		System.out.println("live");
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
		employes.add(new Employe(1L, "Cyril", "Schneidenbach", "12345", new BigDecimal(50000.0),
				LocalDate.of(2019, Month.JANUARY, 30)));
		employes.add(new Employe(2L, "Lorick", "Mattera", "23456", new BigDecimal(40000.0),
				LocalDate.of(2019, Month.MAY, 15)));
		employes.add(new Employe(3L, "Patrick", "létoualdemer", "34567", new BigDecimal(30000.0),
				LocalDate.of(2019, Month.DECEMBER, 01)));
	}

	public void saveEmployee(Employe employe) {
		employes.add(employe);

	}

	public List<Employe> findAllEmployees() {

		return employes;
	}

	public Employe findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(Employe employe) {
		// TODO Auto-generated method stub

	}

}
package fr.dta.service;

import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;
import fr.dta.repository.EmployeMockRepository;

@Service
public class EmployeMockService implements EmployeeService {

	@Autowired
	private EmployeMockRepository emr;

	@PostConstruct
	public void init() {

	}

	public void saveEmployee(Employe employee) {
		// TODO Auto-generated method stub

	}

	public List<Employe> findAllEmployees() {
		return emr.findAllEmployees();
	}

	public Employe findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(Employe employee) {
		// TODO Auto-generated method stub

	}

	public Employe findLastHired() {
		return emr.findAllEmployees().stream().max(Comparator.comparing(Employe::getDateEmbauche)).get();
	}

}
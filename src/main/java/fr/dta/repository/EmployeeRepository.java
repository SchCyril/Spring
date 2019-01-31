package fr.dta.repository;

import java.util.List;

import fr.dta.model.Employe;

public interface EmployeeRepository {

	
	void saveEmployee(Employe employe);

	List<Employe> findAllEmployees();

	Employe findBySsn(String ssn);

	void updateEmployee(Employe employe);
}

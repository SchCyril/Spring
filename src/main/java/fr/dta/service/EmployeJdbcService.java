package fr.dta.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.model.Employe;
import fr.dta.repository.EmployeeJdbcRepository;

@Service
public class EmployeJdbcService implements EmployeeService {

	@Autowired
	private EmployeeJdbcRepository employeJdbcRepository;

	public EmployeJdbcService(EmployeeJdbcRepository employeJdbcRepository) {

		this.employeJdbcRepository = employeJdbcRepository;
	}

	@Override
	 
	public void saveEmployee(Employe employe) {
		employeJdbcRepository.saveEmployee(employe);

	}

	@Override
	public List<Employe> findAllEmployees() {
		return employeJdbcRepository.findAllEmployees();

	}

	@Override
	public Employe findBySsn(String ssn) {
		return employeJdbcRepository.findBySsn(ssn);
	}

	@Override
	public void updateEmployee(Employe employe) {
		employeJdbcRepository.updateEmployee(employe);

	}

	@Override
	public Employe findLastHired() {

		return employeJdbcRepository.findAllEmployees().stream().max(Comparator.comparing(Employe::getDateEmbauche))
				.get();
	}

}

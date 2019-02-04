package fr.dta.service;

import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.exception.EmployeNotFoundException;
import fr.dta.model.Employe;
import fr.dta.repository.EmployeRepository;

@Service
@Transactional(rollbackFor = EmployeNotFoundException.class)
public class EmployeJpaService implements EmployeService {

	@Resource

	private EmployeRepository employeJpaRepository;

	public EmployeJpaService(EmployeRepository employeJpaRepository) {

		this.employeJpaRepository = employeJpaRepository;
	}

	@Override
	public void saveEmployee(Employe employe) {
		employeJpaRepository.saveEmployee(employe);

	}

	@Override
	public List<Employe> findAllEmployees() {
		return employeJpaRepository.findAllEmployees();
		
	}

	@Override
	public Employe findBySsn(String ssn) {
		return employeJpaRepository.findBySsn(ssn);
	
	}

	@Override
	public void updateEmployee(Employe employe) {
		employeJpaRepository.updateEmployee(employe);

	}

	@Override
	public Employe findLastHired() {
		return employeJpaRepository.findAllEmployees().stream().max(Comparator.comparing(Employe::getDateEmbauche))
				.get();
	}

	@Override
	public List<Employe> updateEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteAllEmployees() {
		employeJpaRepository.deleteAllEmployees();
	}



}

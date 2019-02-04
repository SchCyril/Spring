package fr.dta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@SuppressWarnings("unused")
@Service
public class EmployeStubService implements EmployeService {

	private EmployeService employeStubService;

	@Override
	public void saveEmployee(Employe employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employe> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employe employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employe findLastHired() {
		// TODO Auto-generated method stub
		return null;
	}

}

package fr.dta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
public class CompanyService {

	@Autowired
	private EmployeService employeJpaService;

	public void setEmployeeService(EmployeService employeJpaService) {
		this.employeJpaService = employeJpaService;
	}

	public List<Employe> getAllEmployees() {
		return employeJpaService.findAllEmployees();
	}

}

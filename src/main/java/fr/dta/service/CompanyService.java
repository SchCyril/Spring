package fr.dta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
public class CompanyService {

	@Autowired
	private EmployeMockService es;

	public void setEmployeeService(EmployeMockService employeeService) {
		this.es = employeeService;
	}

	public List<Employe> getAllEmployees() {
		return es.findAllEmployees();
	}

}

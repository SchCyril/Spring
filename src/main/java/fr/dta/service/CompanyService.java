package fr.dta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
public class CompanyService {

	@Autowired
	private EmployeService employeMockService;

	public void setEmployeeService(EmployeService employeMockService) {
		this.employeMockService = employeMockService;
	}

	public List<Employe> getAllEmployees() {
		return employeMockService.findAllEmployees();
	}

}

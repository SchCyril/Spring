package fr.dta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
public class MainService {

	@Autowired
	private EmployeService employeJdbcService;

	public void start() {
		Employe cyril = new Employe("Cyril", "Schneidenbach", "12345", new BigDecimal(50000.0), LocalDate.now());

		Employe lorick = new Employe("Lorick", "Mattera", "23456", new BigDecimal(40000.0), LocalDate.now());

		employeJdbcService.saveEmployee(lorick);

		System.out.println(employeJdbcService.findAllEmployees());

	}
}

package fr.dta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
public class MainService {

	@Autowired
	private EmployeService employeJpaService;
	
	

	public void start() {
		Employe cyril = new Employe("Cyril", "Schneidenbach", "12345", new BigDecimal(50000.0), LocalDate.now());

		Employe lorick = new Employe("Lorick", "Mattera", "23456", new BigDecimal(40000.0), LocalDate.now());
		
		Employe test = new Employe(1L, "Test", "Test", "123456", new BigDecimal(40000.0), LocalDate.now());
		
		employeJpaService.deleteAllEmployees();

		employeJpaService.saveEmployee(cyril);
		employeJpaService.saveEmployee(lorick);
		
		
		

	System.out.println(employeJpaService.findBySsn("12345").toString());
	System.out.println(employeJpaService.findBySsn("23456").toString());
	

	}
}

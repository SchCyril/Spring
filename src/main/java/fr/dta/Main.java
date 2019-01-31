package fr.dta;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.dta.model.Employe;
import fr.dta.service.EmployeJdbcService;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "fr.dta")

@PropertySource("classpath:application.properties")
public class Main {

	public static void main(String[] args) {
		Employe cyril = new Employe("Cyril", "Schneidenbach", "12345", new BigDecimal(50000.0),
				LocalDate.now());
		

		Employe lorick = new Employe("Lorick", "Mattera", "23456", new BigDecimal(40000.0),
				LocalDate.now());
	

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		EmployeJdbcService es = (EmployeJdbcService) context.getBean("employeJdbcService");
		
		
	es.saveEmployee(lorick);
		
		System.out.println(es.findAllEmployees());
		
		
		
		
		
		
		

	}

}

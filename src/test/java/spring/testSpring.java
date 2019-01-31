package spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.dta.repository.EmployeMockRepository;
import fr.dta.service.CompanyService;
import fr.dta.service.EmployeMockService;

public class testSpring {

	private final static AbstractApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	@Test
	public void test() {
		new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	@Test
	public void lastHiredTest() {
		EmployeMockRepository emr = (EmployeMockRepository) context.getBean("employeMockRepository");

		EmployeMockService ems = (EmployeMockService) context.getBean("employeMockService");
	}

	@Test
	public void findEmployeTest() {
		CompanyService cs = (CompanyService) context.getBean("companyService");
		Assert.assertEquals(3,cs.getAllEmployees().size());
		

	}
}

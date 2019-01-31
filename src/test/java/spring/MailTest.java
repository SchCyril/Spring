//package spring;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import fr.dta.repository.EmployeMockRepository;
//import fr.dta.service.MailService;
//
//public class MailTest {
//	
//	@Test
//	public void Test() {
//		
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//	
//	MailService msa = context.getBean(MailService.class);
//	MailService msb = context.getBean(MailService.class);
//	EmployeMockRepository emr = (EmployeMockRepository) context.getBean("employeMockRepository");
//	
//		
//	
//	msa.setMessage("Bonjour");
//	msb.setMessage("Au Revoir");
//	msa.mailSend(emr.getEmployes().get(1));
//	msb.mailSend(emr.getEmployes().get(2));
//	
//	
//	}
//}

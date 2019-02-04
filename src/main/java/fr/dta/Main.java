package fr.dta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.dta.service.MainService;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "fr.dta")

@PropertySource("classpath:application.properties")
public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		MainService mainService = (MainService) context.getBean("mainService");
		mainService.start();
		context.close();
	}

}

package com.rameshn.innerBeanInjectionXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class InnerBeanInjectionXmlApplication {

	public static void main(String[] args) {

		// SpringApplication.run(InnerBeanInjectionXmlApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmailEditor ee = (EmailEditor) context.getBean("emailEditor");
		ee.spellCheck();


	}

}

package com.viplav.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.viplav.spring.boot.controller.PersonController;
import com.viplav.spring.dao.PersonDao;
import com.viplav.spring.service.PersonService;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { HibernateJpaAutoConfiguration.class })
//@ComponentScan(basePackages= {"com.viplav.spring.boot.service","com.viplav.spring.boot.controller","com.viplav.spring.boot"})
@ComponentScan(basePackageClasses= {PersonService.class,PersonController.class,PersonDao.class,DBConfig.class})

public class BootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootApplication.class, args);
		  ApplicationContext context = SpringApplication.
			        run(BootApplication.class, args);
		  System.out.println("Contains sessionFactory  " + context.containsBeanDefinition("sessionFactory"));
	}

}

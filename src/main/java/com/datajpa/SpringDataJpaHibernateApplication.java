package com.datajpa;

import com.datajpa.entity.Customer;
import com.datajpa.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaHibernateApplication {

	public static void main(String[] args) {


		ApplicationContext ctx=SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
		Customer c= new Customer();
		c.setCustId(107);
		c.setCustName("Jack");
		c.setAddress("address 107");
		CustomerRepository repo= ctx.getBean(CustomerRepository.class);
		//repo.searchById(101);
		repo.addNewCustomer(c);
		c.setAddress("109");
		System.out.println("done !");
	}

}

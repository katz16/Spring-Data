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
		c.setCustId(101);
		c.setCustName("Vikram");
		c.setAddress("address 101");
		CustomerRepository repo= ctx.getBean(CustomerRepository.class);
		repo.addNewCustomer(c);
		System.out.println("Saved !");
	}

}

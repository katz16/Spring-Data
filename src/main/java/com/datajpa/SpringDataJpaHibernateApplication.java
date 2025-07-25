package com.datajpa;

import com.datajpa.entity.Address;
import com.datajpa.entity.Customer;
import com.datajpa.entity.Employee;
import com.datajpa.repository.CustomerRepository;
import com.datajpa.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaHibernateApplication {

	public static void main(String[] args) {


		ApplicationContext ctx=SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
		/*Customer c= new Customer();
		c.setCustId(107);
		c.setCustName("Jack");
		c.setAddress("address 107");*/
		//CustomerRepository repo= ctx.getBean(CustomerRepository.class);
		//repo.searchById(101);
		//repo.addNewCustomer(c);
		//c.setAddress("109");
		//repo.updateAddress(110, "new address");
		/*Employee e= new Employee();
		Address a= new Address();
		e.setId(105);
		e.setEmpName("Michael");
		a.setDoorNo("20D");
		a.setPinCode(123456);
		a.setPlaceName("Sicily Italy");
		e.setAddress(a);*/
		EmployeeRepository employeeRepository=ctx.getBean(EmployeeRepository.class);
		//employeeRepository.addNewEmployee(e);
		//employeeRepository.searchEmployeeById(101);
		//employeeRepository.allEmps();
		employeeRepository.searchEmployeeByPlace("Monaco");
		System.out.println("done !");
	}

}

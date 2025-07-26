package com.datajpa;

import com.datajpa.entity.Address;
import com.datajpa.entity.Customer;
import com.datajpa.entity.Employee;
import com.datajpa.entity.Student;
import com.datajpa.repository.CustomerRepository;
import com.datajpa.repository.EmployeeRepository;
import com.datajpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

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
		*/
		//EmployeeRepository employeeRepository=ctx.getBean(EmployeeRepository.class);
		//employeeRepository.addNewEmployee(e);
		//employeeRepository.searchEmployeeById(101);
		//employeeRepository.allEmps();
		//employeeRepository.searchEmployeeByPlace("Monaco");
		Student s= new Student();
		s.setStudId(101);
		s.setStudName("John");
		s.setCourse("B.Tech");
		Address a= new Address();

		a.setDoorNo("20D");
		a.setPinCode(123456);
		a.setPlaceName("Sicily Italy");

		Address a2= new Address();

		a2.setDoorNo("20D");
		a2.setPinCode(123456);
		a2.setPlaceName("Sicily Italy");
		List<Address>list= List.of(a, a2);
		s.setAddress(list);
		StudentRepository sr= ctx.getBean(StudentRepository.class);
		/*sr.addStudent(s);
		System.out.println("Student added successfully !");*/
		System.out.println("Fetching all students ...");
		sr.searchById(101);
		System.out.println("done !");
	}

}

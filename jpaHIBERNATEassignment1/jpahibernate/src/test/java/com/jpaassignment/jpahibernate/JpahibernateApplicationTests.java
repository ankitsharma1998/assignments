package com.jpaassignment.jpahibernate;

import com.jpaassignment.jpahibernate.entities.Employee;
import com.jpaassignment.jpahibernate.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpahibernateApplicationTests {
	@Autowired
EmployeeRepository empl;
	@Test
	void contextLoads() {
	}

	//ques3
	@Test
	public void testcreate(){
	Employee emp =new Employee();
	emp.setName("chetan");
	emp.setAge(27);
	emp.setLocation("delhi");
	empl.save(emp);
	Employee emp2 =new Employee();
	emp2.setName("Ankit");
	emp2.setAge(23);
	emp2.setLocation("rajasthan");
	empl.save(emp2);
	}

	//ques4
	@Test
	public void testupdate(){
		Employee employees = empl.findById(1).get();
		employees.setAge(31);
		empl.save(employees);
		System.out.println("=================================");
		System.out.println("Name  \t  Location");
		System.out.println(employees.getName()+" \t  " +employees.getLocation());
	}
	//ques5
	@Test
	public void testdelete()
	{
		empl.deleteById(2);
	}

//ques6
	@Test
	public void testread() {
		Employee employee = empl.findById(3).get();
		assertNotNull(employee);
		assertEquals("Ankit", employee.getName());
		System.out.println("=============================================================================");
		System.out.println("Name  \t\t  Location");
		System.out.println(employee.getName() + " \t  " + employee.getLocation());
	}
//ques7
   @Test
   public void testCountEmployees(){
	System.out.println("Total Records in Employee Table ============>"+empl.count());
	}

//ques8
	@Test
	public void testpaginationandsortingonemployee(){
		Pageable pageable = PageRequest.of(0, 2, Sort.by(Sort.Order.asc("age")));
		Page<Employee> results = empl.findAll(pageable);
		System.out.println("============================");
		System.out.println("Name  \t\t  Age");
		results.forEach(result->System.out.println(result.getName() + " \t  "+result.getAge()));
	}

//Ques9
	@Test
	public void testFindByNameOfEmployee(){
		List<Employee> employees = empl.findByName("Ankit");
		System.out.println("===================");
		System.out.println("Name  \t  Location");
		employees.forEach(employee -> System.out.println(employee.getName()+" \t  " +employee.getLocation()));
	}

	//Ques 10
	@Test
	public void testFindByNameThatStartsWithAOfEmployee(){
		List<Employee> employees = empl.findByNameLike("A%");
		System.out.println("===================");
		System.out.println("Name  \t Location");
		employees.forEach(employee -> System.out.println(employee.getName()+" \t  " +employee.getLocation()));
	}
//Ques11
@Test
public void testFindByAgeBetween28And32ofEmployee(){
	List<Employee> employees = empl.findByAgeBetween(28,32);
	System.out.println("=====================");
	System.out.println("Name \t Age");
	employees.forEach(employee -> System.out.println(employee.getName()+" \t  " +employee.getAge()));
 	}
}



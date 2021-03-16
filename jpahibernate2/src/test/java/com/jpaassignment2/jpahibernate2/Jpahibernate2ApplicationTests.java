package com.jpaassignment2.jpahibernate2;

import com.jpaassignment2.jpahibernate2.entities.*;
import com.jpaassignment2.jpahibernate2.repositories.EmployeeRepository;
import com.jpaassignment2.jpahibernate2.repositories.EmployeeMappingRepository;
import com.jpaassignment2.jpahibernate2.repositories.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class Jpahibernate2ApplicationTests {

	@Autowired
	PaymentRepository paymentRepository;

	@Autowired
	EmployeeMappingRepository employeeMappingRepository;
@Autowired
EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void testEmployeeCreate(){
		Employee employee = new Employee();
		employee.setFirstName("Ankit");
		employee.setLastName("singh");
		employee.setSalary(90000);
		employee.setAge(23);
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setFirstName("himanshu");
		employee2.setLastName("bisht");
		employee2.setSalary(80000);
		employee2.setAge(35);
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setFirstName("drisham");
		employee3.setLastName("sehrawat");
		employee3.setSalary(38000);
		employee3.setAge(47);
		employeeRepository.save(employee3);
	}


	@Test
	public void testFindAllEmployees(){
		System.out.println(employeeRepository.findAllEmployees());
	}
//ques1
	@Test
	public void testFindAllStudentsPartial(){
		Sort sort = Sort.by("age").ascending().and(Sort.by("salary").descending());
		List<Object[]> partialData = employeeRepository.findAllEmployeeBySalaryGreaterThan(sort);
		for (Object[] objects : partialData) {
			System.out.println(objects[0]+ " "+objects[1]);
		}
	}
	//ques2
	@Test
	@Transactional
	public void testUpdateSalaryOfEmployeeLessThanAvg(){
		double salary = 6800;
		double avgSalary = employeeRepository.findAverageSalary();
		employeeRepository.updateSalaryOfEmployeeLessThanAvg(salary,avgSalary);
	}
//ques3
	@Test
	@Transactional
	public void testDeleteEmployeeSalary(){
		double minSalary = employeeRepository.findMinimumSalary();
		employeeRepository.deleteEmployeeSalary(minSalary);
	}
//native ques1
	@Test
	public void testGetAllEmployeeWhoseNameEndsWith(){
		List<Object[]> empData = employeeRepository.getAllEmployeeWhoseNameEndsWith();
		for(Object[] obj: empData){
			System.out.println(obj[0]+" "+obj[1]);
		}
	}
//native ques2
	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteEmployeeHavingAgeGreaterThan(){
		employeeRepository.deleteEmployeeHavingAgeGreaterThan(45);
	}


	//payment tests for single_table
	/*
	@Test
	public void createPayment(){
		CreditCard cc = new CreditCard();
		cc.setId(1);
		cc.setAmount(5000);
		cc.setCardnumber("555147963");
		paymentRepository.save(cc);
	}
	 */
	//payment tests for single_table
	@Test
	public void createPayment(){
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(5000);
		cc.setCardnumber("555147963");
		paymentRepository.save(cc);
	}
	@Test
	public void createCheckPayment(){
		Check ch = new Check();
		ch.setId(1);
		ch.setAmount(5000);
		ch.setCheckNumber("555147963");
		paymentRepository.save(ch);
	}

	@Test
	public void createNewStudent(){
		EmployeeMapping emp = new EmployeeMapping();
		emp.setId(1);
		emp.setFirstname("Ankit");
		emp.setLastname("sharma");
		emp.setAge(23);
		Salary sal = new Salary();
		sal.setBasicsalary(7000);
		sal.setBonussalary(1200);
		sal.setSpecialallowancesalary(800);
		sal.setTaxamount(600);
		emp.setSalary(sal);
		employeeMappingRepository.save(emp);
	}
}

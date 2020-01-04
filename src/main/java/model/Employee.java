package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import service.IEmployeeService;

@Component
public class Employee {
	@Autowired
//	@Qualifier("Clerk")
	@Qualifier("Manager")
	IEmployeeService employeeService;

	public void showSalary() {
		System.out.println(employeeService.calculateSalary());
	}

}

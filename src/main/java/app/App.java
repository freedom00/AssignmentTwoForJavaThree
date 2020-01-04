package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Employee;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("model");
		annotationConfigApplicationContext.scan("service");
		annotationConfigApplicationContext.refresh();

		Employee employee = annotationConfigApplicationContext.getBean(Employee.class);
		employee.showSalary();

		annotationConfigApplicationContext.close();

	}

}

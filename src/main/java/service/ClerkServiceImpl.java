package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Clerk")
public class ClerkServiceImpl implements IEmployeeService {

	public double calculateSalary() {
		return 6000;
	}

}

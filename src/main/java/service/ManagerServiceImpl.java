package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Manager")
public class ManagerServiceImpl implements IEmployeeService {

	public double calculateSalary() {
		return 10000;
	}

}

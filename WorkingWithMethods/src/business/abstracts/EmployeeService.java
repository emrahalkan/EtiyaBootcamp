package business.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public List<Employee> getAll();
}

package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	public List<Employee> getAll(); 
}

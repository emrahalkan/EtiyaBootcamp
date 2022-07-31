package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.EmployeeDao;
import entities.concretes.Employee;

public class EFrameworkEmployeeDal implements EmployeeDao {

	List<Employee> employees = new ArrayList<>();

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public List<Employee> getAll() {
		return employees;
	}
}

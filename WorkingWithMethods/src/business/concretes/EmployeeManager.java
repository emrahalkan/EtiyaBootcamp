package business.concretes;

import java.util.List;

import business.abstracts.EmployeeService;
import dataAccess.abstracts.EmployeeDao;
import entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

}

import business.abstracts.CustomerService;
import business.abstracts.EmployeeService;
import business.concretes.CustomerManager;
import business.concretes.EmployeeManager;
import core.adapters.KpsServiceAdapter;
import dataAccess.concretes.EFrameworkEmployeeDal;
import dataAccess.concretes.HibernateCustomerDal;
import entities.concretes.Customer;
import entities.concretes.Employee;

public class Main {

	public static void main(String[] args) {
		employeeDemo();
		//customerDemo();
	}

	private static void customerDemo() throws Exception {
		Customer customer = new Customer(1, "Emrah", "Alkan", "123123", 1994, 24);
		CustomerService customerService = new CustomerManager(new HibernateCustomerDal(), new KpsServiceAdapter());

		customerService.add(customer);
	}

	private static void employeeDemo() {
		EmployeeService employeeService = new EmployeeManager(new EFrameworkEmployeeDal());
		Employee employee = new Employee(1, "Betül", "Kayam", "22222", 1995, 10000000);
		employeeService.add(employee);
		for (Employee item : employeeService.getAll()) {
			System.out.println(item.getFirstName());
		}

	}
}

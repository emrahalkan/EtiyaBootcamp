package business.concretes;

import business.abstracts.CustomerService;
import business.abstracts.PersonService;
import dataAccess.abstracts.CustomerDao;
import dataAccess.concretes.EFrameworkCustomerDal;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	private CustomerDao customerDao;
	private PersonService personService;

	public CustomerManager(CustomerDao customerDao, PersonService personService) {
		this.customerDao = customerDao;
		this.personService = personService;
	}

	@Override
	public void add(Customer customer) throws Exception {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);

		checkCustomerExists(customer);
		customerDao.add(customer);
	}

	@Override
	public void addByOtherBusiness(Customer customer) throws Exception {
		validateLastNameIfEmpty(customer);
		validateFirstNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);

		checkCustomerExists(customer);
		customerDao.add(customer);
	}

	private void validateFirstNameIfEmpty(Customer customer) throws Exception {
		if (customer.getFirstName().isEmpty()) {
			throw new Exception("isim boş olamaz!!");
		}

	}

	private void validateLastNameIfEmpty(Customer customer) throws Exception {
		if (customer.getLastName().isEmpty()) {
			throw new Exception("soyisim boş olamaz!!");
		}

	}

	private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {
		if (customer.getIdentityNumber().isEmpty()) {
			throw new Exception("TC kimlik no boş olamaz!!");
		}

	}

//    private  boolean  customerExists(Customer customer){
//        return true;
//    }

	private void checkCustomerExists(Customer customer) throws Exception {
		// CustomerDao customerDao = new CustomerDao();
		if (customerDao.customerExists(customer)) {
			throw new Exception("Müşteri zaten mevcut");
		}
	}
}

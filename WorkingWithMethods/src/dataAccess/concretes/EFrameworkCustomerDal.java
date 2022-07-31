package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class EFrameworkCustomerDal implements CustomerDao {
	@Override
	public void add(Customer customer) {
		System.out.println("Entity framework ile veritabanına eklendi");
	}
	
	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}
}

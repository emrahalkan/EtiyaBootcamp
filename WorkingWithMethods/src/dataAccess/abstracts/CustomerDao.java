package dataAccess.abstracts;

import entities.concretes.Customer;

public interface CustomerDao {
	public void add(Customer customer);
	public boolean customerExists(Customer customer);
}

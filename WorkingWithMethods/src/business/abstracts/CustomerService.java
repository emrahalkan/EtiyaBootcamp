package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
	public void add(Customer customer) throws Exception ;
	public void addByOtherBusiness(Customer customer) throws Exception ;
}

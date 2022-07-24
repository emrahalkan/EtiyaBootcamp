package cafeShop.business.abstracts;

import cafeShop.entities.concretes.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}

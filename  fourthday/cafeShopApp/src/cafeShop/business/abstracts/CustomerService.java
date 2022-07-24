package cafeShop.business.abstracts;

import cafeShop.entities.concretes.Customer;

import java.rmi.RemoteException;

public interface CustomerService {
    void save(Customer customer) throws NumberFormatException, RemoteException, Exception;
}

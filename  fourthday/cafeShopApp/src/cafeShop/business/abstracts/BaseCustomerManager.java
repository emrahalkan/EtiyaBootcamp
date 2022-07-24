package cafeShop.business.abstracts;

import cafeShop.entities.concretes.Customer;

import java.lang.constant.Constable;
import java.rmi.RemoteException;

public abstract class BaseCustomerManager {
    public void save(Customer customer) throws NumberFormatException, RemoteException, Exception {
        System.out.println("Saved to db : " + customer.getFirstName());
    }
}

package cafeShop.core.adapter;

import cafeShop.business.abstracts.CustomerCheckService;
import cafeShop.entities.concretes.Customer;

import java.rmi.RemoteException;

public class FakeCustomerCheckService implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        return true;
    }
}

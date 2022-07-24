package cafeShop.core.adapter;

import MernisReferance.RPGKPSPublicSoap;
import cafeShop.business.abstracts.CustomerCheckService;
import cafeShop.entities.concretes.Customer;

import java.rmi.RemoteException;
import java.util.Locale;

public class MernisKpsAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        RPGKPSPublicSoap rpgkpsPublicSoap = new RPGKPSPublicSoap();
        boolean result = rpgkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getYearOfBirth());
        return result;
    }
}

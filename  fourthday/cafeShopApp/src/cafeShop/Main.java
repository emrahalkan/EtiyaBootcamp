package cafeShop;

import MernisReferance.RPGKPSPublicSoap;
import cafeShop.business.abstracts.BaseCustomerManager;
import cafeShop.business.concretes.NeroCustomerManager;
import cafeShop.business.concretes.StarbucksCustomerManager;
import cafeShop.core.adapter.FakeCustomerCheckService;
import cafeShop.core.adapter.MernisKpsAdapter;
import cafeShop.entities.concretes.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"Emrah","Alkan","123456",1994);
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new FakeCustomerCheckService());
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisKpsAdapter());
        neroCustomerManager.save(customer);
        starbucksCustomerManager.save(customer);
    }
}

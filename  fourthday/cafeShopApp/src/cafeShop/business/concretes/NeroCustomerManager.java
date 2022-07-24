package cafeShop.business.concretes;

import cafeShop.business.abstracts.BaseCustomerManager;
import cafeShop.business.abstracts.CustomerCheckService;
import cafeShop.business.abstracts.CustomerService;
import cafeShop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }else {
            throw new Exception("Not a valid person");
        }

    }
}

package entities.concretes;

import java.util.List;

import entities.abstracts.Customer;

public class CorporateCustomer extends Customer{
    private String taxNumber;
    private String companyName;

    public CorporateCustomer(){
        super();
    }

    public CorporateCustomer(String taxNumber, String companyName, int id, String customerNumber, List<Subscription> subscriptions, List<Address> addresses ) {
        super(id,customerNumber,subscriptions,addresses);
        this.taxNumber = taxNumber;
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

package entities.concretes;

import entities.abstracts.Customer;

public class Address {
    private int id;
    private String detail;
    private AddressType addressType;
    private Customer customer;
    
    // 1, Ev
    // 2, Abonelik
    // 1 asfasfmasmf , 2 , 1

    public Address() {
    }

    public Address(int id, String detail, AddressType addressType, Customer customer) {
        this.id = id;
        this.detail = detail;
        this.addressType = addressType;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

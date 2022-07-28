package entities.concretes;

import java.util.List;

import entities.abstracts.Product;

public class Service {
    private int id;
    private String name;
    private List<Product> products;
    private List<Subscription> subsriptions;


	public Service() {
    }

    public Service(int id, String name,  List<Product> products, List<Subscription> subscriptions) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.subsriptions = subscriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public List<Subscription> getSubsriptions() {
  		return subsriptions;
  	}

  	public void setSubsriptions(List<Subscription> subsriptions) {
  		this.subsriptions = subsriptions;
  	}
}

package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class HibernateProductDal implements ProductDao {
	 List<Product> products = new ArrayList<>();
	    @Override
	    public void add(Product product) {
	        System.out.println("Hibernate ile eklendi");
	        products.add(product);
	    }

	    @Override
	    public List<Product> getAll() {
	        return products;
	    }
}

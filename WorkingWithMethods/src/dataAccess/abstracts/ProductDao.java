package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface ProductDao {
	public void add(Product product);
	public List<Product> getAll();
}

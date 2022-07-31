package business.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface ProductService {
	
	public void add(Product product);
	public List<Product> getAll();
}

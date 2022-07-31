package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        productDao.add(product);

    }

    @Override
    public List<Product> getAll() {
        return this.productDao.getAll();
    }
}

package com.mphasis.training.daos;

import java.util.List;

import com.mphasis.training.pojos.Product;

public interface ProductDao {
	public List<Product> getAllProduct();
	public void insertProduct(Product p);
	public void updateProduct(int id,double cost,int quantity);
	public void deleteProduct(int id);
	public List<Product> getProductByName(String name);
	public Product getProductById(int pid);
}

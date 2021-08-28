package in.bookvendor.service;

import java.util.List;
import java.util.Optional;

import in.bookvendor.model.Product;

public interface IProductService {

	List<Product> getProductsByCode(String user);

	Optional<Product> getProductById(long id);

	void updateProduct(Product product);

	void addProduct(Product product);

	void deleteProduct(long id);
	
	void saveProduct(Product todo);

}
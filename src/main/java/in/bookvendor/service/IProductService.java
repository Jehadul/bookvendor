package in.bookvendor.service;

import java.util.List;
import java.util.Optional;

import in.bookvendor.model.Product;

public interface IProductService {

	Optional<Product> getProductById(Long id);

	void updateProduct(Product product);

	void deleteProduct(Long id);
	
	void saveProduct(Product todo);

	List<Product> getAllProducts();

}
package in.bookvendor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bookvendor.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByProductCode(String code);
}

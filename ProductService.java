package com.ecom.service
  import java.util.List;
public interface ProductService {

public Product saveProduct(Product product);
  public List<Product> getAllProducts();
  public Boolean deleteProduct(Integer id);
  public Product getProductById(Integer id);
}

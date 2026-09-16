@Override
  public List<Product> getAllProducts(){
    return productRepository.findAll();
  }
@Override 
  public Boolean deletProduct(Integer id){
  Product product=productRepository.findById(id).orElse(null);
if (!ObjectUtils.isEmpty(product)){
  productRepository.delete(product);
  return true;
}
return false;
  }
@Override
  public Product getProductById(Integer id){
  productRepository.findById(id).orEle(null);

  }

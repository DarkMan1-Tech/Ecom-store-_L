@PostMapping("/saveProduct")
  public String saveProduct (@ModelAttribute Product product, HttpSession session){
    Product saveProduct= productService.saveProduct(product);
if (!ObjectUtils.isEmpty(saveProduct)){
  session.setAttribute("succMsg","Product Saved Successfully");
}
else{
   session.setAttribute("errorMsg","Product Not Saved Successfully Some Thing Wrong on the server");
}
  } 

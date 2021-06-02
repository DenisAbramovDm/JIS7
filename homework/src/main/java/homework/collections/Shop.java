package homework.collections;


import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Shop {
  private Set<Product> shop = new HashSet<>();

  public void addProduct(Product product){
      shop.add(product);
  }

  public void printShop(){
      for (Product product :
              shop) {
          System.out.println(product.toString());
      }
  }

  public void removeProduct(Product product){
      shop.remove(product);
  }

  public Product findProductByName(String name){
      boolean itemWasFound = false;
      Product productForReturn = new Product();
      for (Product product :
              shop) {
          if (product.getProductName().equals(name)){
              productForReturn = product;
              itemWasFound = true;
          }
      }
      if (itemWasFound){
          return productForReturn;}
      else{
          throw new ItemNotFoundException("Product was not found");
      }
  }

  public ArrayList<Product> findProductsBetweenPriceRange(BigDecimal leftValue, BigDecimal rightValue){
      ArrayList<Product> listOfProducts= new ArrayList<>();
      for (Product product :
              shop) {
          if (product.getProductPrice().compareTo(leftValue) >= 0 && product.getProductPrice().compareTo(rightValue) <= 0){
              listOfProducts.add(product);
          }
      } return listOfProducts;
  }
}

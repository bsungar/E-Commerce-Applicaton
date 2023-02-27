
package test;


import java.util.Scanner;

/**
 *
 * @author beyza
 */
public class product {
   Scanner sc = new Scanner(System.in);
    private String productName;
    private String productColor;
    private String productCat;
    private int Stock;
    private String productw;
    private String description;
   product(){} 
 
    
    
  public  product(String productName,String productColor, String productCat, int Stock, String productw,String description){
  this.productName = productName;
  this.productColor = productColor;
  this.productw = productw;
  this.productCat = productCat;
  this.Stock = Stock;
  this.description = description;
  }
 
 
    
   @Override
 public String toString() {
        return "Product{" +
                " name='" + productName + '\'' +
                ", color='" + productColor + '\'' +
                ", category='" + productCat+ '\'' +
                ", stock=" + Stock + '\'' +
                ", weight=" + productw +
                '}';       
 }
    
    
    

public void setProductName(String productName){
      this.productName= productName;
}
 public String getProductName(){
     return productName;
 }
public void setProductColor(String productColor){
    this.productColor= productColor;
}
public String getproductColor(){
    return productColor;
}
public void setProductCat(String productCat){
    this.productCat = productCat;
}
public String getProductCat(){
    return productCat;
}
public void setStock(int Stock){
    this.Stock = Stock;
}
public int getStock(){
    return Stock;
}
public void setProductw(String productw){
    this.productw= productw;
}
public String getProductw(){
    return productw;
}
public void setDescription(String description){
this.description=description;
}
public String getDescription(){
    return description;
}
 

 
 
   }

package com.simformsolutions.overloading;

public class Product {

  public void findProduct(int productId){
    System.out.println("ProductId : " + productId);
  }

  public void findProduct(String productName){
    System.out.println("productName : " + productName);
  }

  public void findProduct(int productId , String productName){
    System.out.println("ProductId : " + productId  + "\t\t\tproductName : " + productName);
  }
}

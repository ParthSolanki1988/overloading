package com.simformsolutions.overloading;

public class FindProduct {

  public void product(int productId){
    System.out.println("ProductId : " + productId);
  }

  public void product(String productName){
    System.out.println("productName : " + productName);
  }

  public void product(int productId , String productName){
    System.out.println("ProductId : " + productId  + "\t\t\tproductName : " + productName);
  }
}

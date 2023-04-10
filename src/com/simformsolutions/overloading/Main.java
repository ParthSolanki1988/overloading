package com.simformsolutions.overloading;

public class Main {
  public static void main(String[] args) {
    Product product = new Product();

    product.findProduct(101);
    product.findProduct("One Plus Mobile");
    product.findProduct(102, "Iphone Mobile");

  }
}

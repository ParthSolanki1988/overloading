package com.simformsolutions.overloading;

public class Main {
  public static void main(String[] args) {
    FindProduct findProduct = new FindProduct();

    findProduct.product(101);
    findProduct.product("One Plus Mobile");
    findProduct.product(102, "Iphone Mobile");

  }
}

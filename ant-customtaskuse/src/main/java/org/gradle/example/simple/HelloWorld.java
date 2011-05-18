package org.gradle.example.simple;

public class HelloWorld {
  public static void main(String args[]) {
    System.out.println("hello, world");
  }
  
  public static void doNothing() {
      //Empty if statement should be disliked by PMD
      if(true) {
      }
  }
}

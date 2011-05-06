package org.gradle.example.codedpoet;

import org.gradle.example.codec.Encoder;
import org.gradle.example.content.ContentFactory;
import org.gradle.example.content.Content;

public class CommandLine {
  
  public static int main(String args[]) {
    if(args == 1) {
      String poetName = args[0];
      
      ContentFactory contentFactory = ContentFactory.getInstance();
    }
    else {
      System.out.println("usage: CommandLine <poet_name>");
    }
  }
}
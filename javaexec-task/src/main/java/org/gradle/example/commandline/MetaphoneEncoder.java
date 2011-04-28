package org.gradle.example.commandline;

import org.apache.commons.codec.language.Metaphone;

public class MetaphoneEncoder {
  public static void main(String args[]) {
    Metaphone codec = new Metaphone();
    String phrase = "";
    String encoded = "";
    for(String s : args) {
      phrase += s.toUpperCase() + " ";
      encoded += codec.encode(s) + " ";
    }
    
    System.out.println("PHRASE =" + phrase);
    System.out.println("ENCODED=" + encoded);
  }
}

package org.gradle.example.codec;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.codec.language.Metaphone;
import org.apache.commons.codec.binary.Base64;

public class Encoder {
  
  public String encode(String plainText) {
    Metaphone metaphoneCodec = new Metaphone();
    List<String> encodedTokens = new ArrayList<String>();

    List<String> tokens = tokenize(plainText);
    for(String token : tokens) {
      encodedTokens.add(metaphoneCodec.encode(token));
    }
    
    String metaphone = join(encodedTokens, " ");
    byte[] base64 = Base64.encodeBase64Chunked(metaphone.getBytes());
    return new String(base64);
  }
  
  private String join(Collection<String> collection, String separator) {
    StringBuffer sb = new StringBuffer();
    Iterator<String> iter = collection.iterator();
    while(iter.hasNext()) {
      sb.append(iter.next());
      sb.append(separator);
    }
    
    return sb.toString();
  }

  private List<String> tokenize(String phrase) {
    if(phrase != null) {
      return Arrays.asList(phrase.split(" "));
    }
    else {
      return new ArrayList<String>();
    }
  }
}

package org.gradle.example.content;

public class ContentFactory {
  private static ContentFactory instance;

  public static ContentFactory getInstance() {
    if(instance == null) {
      instance = new ContentFactory();
    }
    
    return instance;
  }
  
  public Content getContentProvider(String poet) {
    Content provider = null;
    
    if(poet != null) {
      if(poet.equals("shakespeare")) {
        provider = new ShakespeareContent();
      }
      else if(poet.equals("williams")) {
        provider = new WilliamCarlosWilliamsContent();
      }
      else if(poet.equals("shelley")) {
        provider = new ShelleyContent();
      }
      else if(poet.equals("chesterton")) {
        provider = new ChestertonContent();
      }
      else {
        throw new IllegalArgumentException(poet + " is not a known poet");
      }
    }

    return provider;
  }
}

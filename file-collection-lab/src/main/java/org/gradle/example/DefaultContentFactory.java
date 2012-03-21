package org.gradle.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="poetryFactory")
public class DefaultContentFactory implements ContentFactory {

  @Autowired
  private ContentRegistry contentRegistry;
  
  public Content getContentProvider(String poet) {
    return contentRegistry.get(poet);
  }

}

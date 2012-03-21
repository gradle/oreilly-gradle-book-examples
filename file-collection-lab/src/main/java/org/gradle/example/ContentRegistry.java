package org.gradle.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ContentRegistry {
  private Map<String, Content> contentProviders = new HashMap<String, Content>();

  public Map<String, Content> getContentProviders() {
    return contentProviders;
  }

  public void setContentProviders(Map<String, Content> contentProviders) {
    this.contentProviders = contentProviders;
  }
  
  public Content get(String poet) {
    return contentProviders.get(poet);
  }
  
  public void register(String poet, Content content) {
    contentProviders.put(poet, content);
  }
}

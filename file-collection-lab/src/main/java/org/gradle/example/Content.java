package org.gradle.example;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Content
  implements BeanNameAware {
  
  private String poet;
  
  @Autowired
  private ContentSink contentSink;
  
  @Autowired
  private ContentRegistry contentRegistry;
  
  public abstract List<String> getLines();
  
  public void emit() {
    for(String line : getLines()) {
      contentSink.sink(line);
    }
  }
  
  @PostConstruct
  public void register() {
    contentRegistry.register(poet, this);
  }

  public ContentSink getContentSink() {
    return contentSink;
  }

  public void setContentSink(ContentSink contentSink) {
    this.contentSink = contentSink;
  }

  public ContentRegistry getContentRegistry() {
    return contentRegistry;
  }

  public void setContentRegistry(ContentRegistry contentRegistry) {
    this.contentRegistry = contentRegistry;
  }

  public void setBeanName(String name) {
    poet = name;
  }

}

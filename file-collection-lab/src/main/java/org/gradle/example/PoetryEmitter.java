package org.gradle.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoetryEmitter {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext;
    applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    ContentFactory factory = (ContentFactory)applicationContext.getBean("poetryFactory");
    Content content = factory.getContentProvider("shakespeare");
    content.emit();
  }

}
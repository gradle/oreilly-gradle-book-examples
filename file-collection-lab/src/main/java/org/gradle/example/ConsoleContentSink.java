package org.gradle.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleContentSink implements ContentSink {

  public void sink(String line) {
    System.out.println(line);
  }

}

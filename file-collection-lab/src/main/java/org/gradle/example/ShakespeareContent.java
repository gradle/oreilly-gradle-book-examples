package org.gradle.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="shakespeare")
public class ShakespeareContent extends Content {

  public List<String> getLines() {
    List<String> lines = new ArrayList<String>();
    
    lines.add("Oh pardon me thou bleeding piece of earth");
    lines.add("That I am meek and gentle with these butchers");
    lines.add("Thou art the ruin of the noblest man");
    lines.add("Who ever lived in the tide of times");

    return lines;
  }

}

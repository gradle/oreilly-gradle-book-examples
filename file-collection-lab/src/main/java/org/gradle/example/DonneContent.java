package org.gradle.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="donne")
public class DonneContent extends Content {

  @Override
  public List<String> getLines() {
    List<String> lines = new ArrayList<String>();
    
    lines.add("Death be not proud, though some have called thee");
    lines.add("Mighty and dreadful, for thou art not soe.");
    lines.add("For those whom thou think'st, thou dost overthrow.");
    lines.add("Die not, poore death, nor yet canst thou kill mee.");

    return lines;
  }
  
}

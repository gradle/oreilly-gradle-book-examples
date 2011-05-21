package org.gradle.example.content;

import java.util.List;
import java.util.ArrayList;

public class ShelleyContent
  implements Content {
    
  public List<String> getLines() {
    List<String> lines = new ArrayList<String>();
    
    lines.add("I met a traveler from an antique land");
    lines.add("Who said: Two vast and trunkless legs of stone");
    lines.add("Stand in the desert. Near them, on the sand,");
    lines.add("Half sunk, a shattered visage lies, whose frown");
    lines.add("And wrinkled lip and sneer of cold command");
    lines.add("Tell that its sculptor well those passions read");
    lines.add("Which yet survive, stamped on these lifeless things,");
    lines.add("The hand that mocked them, and the heart that fed");
    
    return lines;
  }
}

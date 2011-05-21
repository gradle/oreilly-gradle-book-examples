package org.gradle.example.content;

import java.util.List;
import java.util.ArrayList;

public class WilliamCarlosWilliamsContent
  implements Content {
    
  public List<String> getLines() {
    List<String> lines = new ArrayList<String>();
    
    lines.add("so much depends upon");
    lines.add("a red wheel barrow");
    lines.add("glazed with rain");
    lines.add("beside the white chickens");
    
    return lines;
  }
}

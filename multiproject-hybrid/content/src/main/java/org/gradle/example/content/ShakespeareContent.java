package org.gradle.example.content;

import java.util.List;
import java.util.ArrayList;

public class ShakespeareContent
  implements Content {
    
  public List<String> getLines() {
    List<String> lines = new ArrayList<String>();
    
    lines.add("Oh pardon me, thou bleeding piece of earth");
    lines.add("That I am meek and gentle with these butchers");
    lines.add("Thou are the ruin of the noblest man");
    lines.add("Who ever livèd in the tide of times");
    lines.add("Woe to the hands that shed this costly blood!");
    lines.add("Over thy wounds now do I prophesy");
    lines.add("Which like dumb mouths do ope their ruby lips");
    lines.add("To beg the voice and utterance of my tongue");
    
    return lines;
  }
}

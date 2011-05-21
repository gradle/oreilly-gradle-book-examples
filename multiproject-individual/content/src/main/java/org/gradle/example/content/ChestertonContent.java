package org.gradle.example.content;

import java.util.ArrayList;
import java.util.List;


/**
 * <p></p>
 *
 * @author Tim Berglund
 */
public class ChestertonContent
  implements Content
{
  private List<String> lines;

  public ChestertonContent() {
    lines = new ArrayList<String>();

    lines.add("If I had been a heathen, I'd have praised the purple vine");
    lines.add("My slaves should dig the vineyard, and I would drink the wine");
    lines.add("But Higgins is a heathen, and his slaves grow lean and grey");
    lines.add("That he should drink some tepid milk exactly twice a day");
  }


  public List<String> getLines() {
    return lines;
  }
}

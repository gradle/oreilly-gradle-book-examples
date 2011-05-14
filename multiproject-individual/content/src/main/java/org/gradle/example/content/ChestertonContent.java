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
  private long invocationCount;

  public ChestertonContent() {
    lines = new ArrayList<String>();
    invocationCount = 0;

    lines.add("If I had been a heathen, I'd have praised the purple vine");
  }


  public List<String> getLines() {
    invocationCount++;
    return lines;
  }
}

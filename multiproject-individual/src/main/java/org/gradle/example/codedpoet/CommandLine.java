package org.gradle.example.codedpoet;

import java.util.List;
import java.util.ArrayList;
import org.gradle.example.codec.Encoder;
import org.gradle.example.content.ContentFactory;
import org.gradle.example.content.Content;

public class CommandLine {

  public void getAndPrintPoem(String poetName) {
    for(String line: getPoemLines(poetName)) {
      System.out.print(line);
    }
  }

  private List<String> getPoemLines(String poetName) {
    ContentFactory contentFactory = ContentFactory.getInstance();
    Content provider = contentFactory.getContentProvider(poetName);
    List<String> clearTextLines = provider.getLines();
    Encoder encoder = new Encoder();

    List<String> encodedLines = new ArrayList<String>();
    for(String line: clearTextLines) {
      encodedLines.add(encoder.encode(line));
    }
    return encodedLines;
  }

  public static void main(String args[]) {
    if(args.length == 1) {
      String poetName = args[0];
      CommandLine commandLine = new CommandLine();
      commandLine.getAndPrintPoem(poetName);
    }
    else {
      System.out.println("usage: CommandLine <poet_name>");
    }
  }
}

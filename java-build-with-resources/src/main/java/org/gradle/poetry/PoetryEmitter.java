package org.gradle.poetry;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.codec.binary.Base64;

public class PoetryEmitter {
   
   public List<String> poe() {
      List<String> lines = new ArrayList<String>();
      
      lines.add("Ah distinctly I remember it was in the bleak December");
      lines.add("And each separate dying ember wrought its ghost upon the floor");
      lines.add("Eagerly I wished the morrow; vainly I had wished to borrow");
      lines.add("From my books surcease of sorrow—sorrow for the lost Lenore.");
      lines.add("For that rare and radiant maiden whom the angels named Lenore");
      lines.add("Nameless here forevermore.");

      return lines;
   }
   
   public List<String> shelley() {
      List<String> lines = new ArrayList<String>();

      lines.add("I met a traveller from an antique land");
      lines.add("Who said: \"Two vast and trunkless legs of stone");
      lines.add("Stand in the desert. Near them on the sand,");
      lines.add("Half sunk, a shattered visage lies, whose frown");
      lines.add("And wrinkled lip and sneer of cold command");
      lines.add("Tell that its sculptor well those passions read");
      lines.add("Which yet survive, stamped on these lifeless things,");
      lines.add("The hand that mocked them and the heart that fed.");
      lines.add("And on the pedestal these words appear:");
      lines.add("'My name is Ozymandias, King of Kings:");
      lines.add("Look on my works, ye mighty, and despair!'");
      lines.add("Nothing beside remains. Round the decay");
      lines.add("Of that colossal wreck, boundless and bare,");
      lines.add("The lone and level sands stretch far away.\"");

      return lines;
   }

   public List<String> shakespeare() {
      List<String> lines = new ArrayList<String>();
      
      lines.add("O, pardon me, thou bleeding piece of earth,");
      lines.add("That I am meek and gentle with these butchers!");
      lines.add("Thou art the ruins of the noblest man");
      lines.add("That ever lived in the tide of times.");
      lines.add("Woe to the hand that shed this costly blood!");
      lines.add("Over thy wounds now do I prophesy,");
      lines.add("Which, like dumb mouths, do ope their ruby lips,");
      lines.add("To beg the voice and utterance of my tongue");
      lines.add("A curse shall light upon the limbs of men;");
      lines.add("Domestic fury and fierce civil strife");
      lines.add("Shall cumber all the parts of Italy;");
      lines.add("Blood and destruction shall be so in use");
      lines.add("And dreadful objects so familiar");
      lines.add("That mothers shall but smile when they behold");
      lines.add("Their infants quarter'd with the hands of war;");
      lines.add("All pity choked with custom of fell deeds:");
      lines.add("And Caesar's spirit, ranging for revenge,");
      lines.add("With Ate by his side come hot from hell,");
      lines.add("Shall in these confines with a monarch's voice");
      lines.add("Cry 'Havoc!' and let slip the dogs of war;");
      lines.add("That this foul deed shall smell above the earth");
      lines.add("With carrion men, groaning for burial.");

      return lines;
   }
   
   public void emit(List<String> lines) {
      for(String line: lines) {
         System.out.println(encode(line));
      }
   }
   
   public String encode(String line) {
      Base64 codec = new Base64();
      return new String(codec.encode(line.getBytes()));
   }
   
   public static void main(String[] args) {
      PoetryEmitter pe = new PoetryEmitter();
      pe.emit(pe.poe());
   }
}






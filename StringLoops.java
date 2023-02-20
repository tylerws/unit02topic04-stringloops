import java.util.Arrays;

public class StringLoops {

  // static methods go here


  public static String reverseCharacters(String str) {
    String word = "";
    for (int pos = str.length(); pos > 0; pos--) {
      word = word + str.substring(pos-1, pos);
    }
    return word;
    
  }

  public static int[] indexesOfAll(String text, String searchTerm) {
    int count = 0;
    for (int pos = 0; pos < text.length(); pos++) {
      if (searchTerm.equals(text.substring(pos, pos+1))) {
        count++;
      }
    }
    if (count == 0) {
      int[] empty = new int[0];
      return empty;
    } else {
    int[] values = new int[count];
    int index = 0;
    for (int pos = 0; pos < text.length(); pos++) {
      if (searchTerm.equals(text.substring(pos, pos+1))) {
        values[index] = pos;
        index++;
      }
    }
    return values;
  }
  }

  public static boolean hasRepeatedConsecutives(String str) {
    boolean hasRepeat = false;
    for (int curPos = 0; curPos < str.length()-1; curPos++) {
      int posAfter = curPos+1;
      if (str.substring(curPos, curPos+1).equals(str.substring(posAfter, posAfter+1))) {
        hasRepeat = true;
      }
    }
    return hasRepeat;
  }

  public static void main(String[] args) {
  
  //System.out.println(reverseCharacters("chicken"));
  //System.out.println(Arrays.toString(indexesOfAll("attack", "b")));
  System.out.println(hasRepeatedConsecutives("rook"));
  }
}
public class StringLoops {

  // static methods go here


  public static String reverseCharacters(String str) {
    String word = "";
    for (int pos = str.length(); pos > 0; pos--) {
      word = word + str.substring(pos-1, pos);
    }
    return word;
    
    
    
    
  }

  public static void main(String[] args) {
  
  System.out.println(reverseCharacters("chicken"));

  }
}
package stringskatas;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
      
      StringBuilder bdr = new StringBuilder(str.replaceAll("[^a-z]", ""));
      
        return bdr.reverse().toString(); 
    }
}

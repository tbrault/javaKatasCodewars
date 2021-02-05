package stringskatas;

public class VowelCount {
	public static int getCount(String stringToReplace) {
        return stringToReplace.replaceAll("(?i)[^aeiou]", "").length();
    }
}

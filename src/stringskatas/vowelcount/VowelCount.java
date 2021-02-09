package stringskatas.vowelcount;

public class VowelCount {
	public static int getCount(String stringToReplace) {
        return stringToReplace.replaceAll("(?i)[^aeiou]", "").length();
    }
}

package stringskatas.spinwords;

public class SpinWords {

	public String spinWords(String sentence) {

		String[] array = sentence.split(" ");

		for (int i =0; i < array.length; i++) {
			if (array[i].length() >= 5 ) {
				StringBuilder bdr = new StringBuilder();
				bdr.append(array[i]).reverse();
				array[i] = bdr.toString();
			}
		}

		return String.join(" ",array);
	}
}

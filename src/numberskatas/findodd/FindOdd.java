package numberskatas.findodd;

public class FindOdd {
	public static int findIt(int[] numbers) {
		int oddNumber = 0;
		for (int i=0; i<numbers.length; i++) {
			int count = 0;
			for (int j=0; j<numbers.length; j++) 
				if (numbers[i]==numbers[j]) count++;
			if (count%2 == 1) oddNumber = numbers[i];
		}
		return oddNumber;
	}
}

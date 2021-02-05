package stringskatas;

public class TenMinutesWalk {
	private static int currentYPosition = 0;
	private static int currentXPosition = 0;

	public static boolean isValidWalk(char[] directions) {	
		if (directions.length != 10) {
			return false;
		}
		
		for (char direction : directions) {
			updatePosition(direction);
		}
		
		return (currentXPosition == 0 && currentYPosition == 0);
	}
	
	private static void updatePosition(char direction) {
		switch (direction) {
			case 'n': currentYPosition++; break;
			case 's': currentYPosition--; break;
			case 'e': currentXPosition--; break;
			case 'w': currentXPosition++; break;
		}
	}
}

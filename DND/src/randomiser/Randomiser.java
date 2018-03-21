package randomiser;

import java.util.Random;

public class Randomiser {

	public Randomiser() {
		
	}
	//picks number randomly between minimum and 1 below maximum
	public int pickRandom(int number1, int number2) {
		Random r = new Random();
		int Low = number1;
		int High = number2;
		int Result = r.nextInt(High-Low) + Low;
		
		return Result;
	}
}

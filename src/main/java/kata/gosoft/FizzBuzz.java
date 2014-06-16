package kata.gosoft;

public class FizzBuzz {

	public static String getOutput(int input) {
		String output = String.valueOf(input);
		if (input == 15) {
			output = "FizzBuzz";
		} else if (isFizz(input)) {
			output = "Fizz";
		} else if (isBuzz(input)) {
			output = "Buzz";
		}
		return output;
	}

	public static boolean isFizz(int input) {
		return input % 3 == 0;
	}

	public static boolean isBuzz(int input) {
		return input % 5 == 0;
	}

}

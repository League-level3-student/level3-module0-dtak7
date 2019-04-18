package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun moreFun = new MoreArrayFun();
		moreFun.printer();
		moreFun.backwardsPrinter();
		moreFun.brokenPrinter();
		moreFun.randomPrinter();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void printer() {
		String[] letters = { "i", "am", "a", "robot", "" };
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void backwardsPrinter() {
		String[] words = { " ", "robot", "overlords", "will rule", "supreme" };
		for (int i = words.length - 1; i > -1; i--) {
			System.out.println(words[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void brokenPrinter() {
		String[] words = { "Robots are", "less than", "humans", " ", "" };
		for (int i = 0; i < words.length; i += 2) {
			System.out.println(words[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void randomPrinter() {
		int totalPrinted = 0;
		String[] words = { "I", "talk", "like", "Yoda", "I", "do" };
		String[] printed = new String[words.length];
		for (int i = 0; i < words.length + 1; i++) {
			String rando = words[new Random().nextInt(words.length)];
			boolean found = false;
			for (int j = 0; j < printed.length; j++) {
				if (rando.equals(printed[j])) {
					found = true;
					break;
				}
			}
			if (found != true) {
				System.out.println(rando);
				printed[totalPrinted] = rando;
				totalPrinted++;
			} else {
				i--;
			}
		}
	}

}

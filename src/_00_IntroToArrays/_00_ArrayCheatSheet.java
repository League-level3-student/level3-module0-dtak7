package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = { "string1", "String2", "bob", "alfred", "fred" };
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "bobert";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < 5; i++) {
			System.out.println(strings[i] = "rob");
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 7. make an array of 50 integers
		int[] numbers = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(50 + 1);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int largest =numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
			largest=numbers[i];
			}
		}
		int smallest = numbers[0];
		for(int i = 0; i<numbers.length;i++)
		{
			if (numbers[i]<=smallest) {
				smallest=numbers[i];
			}
		}
		// 10 print the entire array to see if step 8 was correct
		for(int i =0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
		}
		// 11. print the largest number in the array.
		
		// 12. print only the last element in the array
		System.out.println(numbers[49]);
	}
}

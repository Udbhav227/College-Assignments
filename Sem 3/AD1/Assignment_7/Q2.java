package Assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
	public static void printDuplicates(List<Integer> arr) {
		int[] hash = new int[100]; // assuming input range is 0-99
		List<Integer> duplicates = new ArrayList<>();

		for (int n: arr) {
			hash[n]++;
			if (hash[n] == 2) 
				duplicates.add(n);
		}

		if (!duplicates.isEmpty()) {
			System.out.println("Duplicates in the list: " + duplicates);
		} else {
			System.out.println("No duplicates found in the list.");
		}
	}

	public static void main(String[] args) {
		// Example usage:
		List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 5);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); // No duplicates
		List<Integer> list3 = Arrays.asList(4, 4, 5, 5, 6, 6, 7, 7); // All duplicates

		System.out.println("List 1: " + list1);
		printDuplicates(list1);

		System.out.println("\nList 2: " + list2);
		printDuplicates(list2);

		System.out.println("\nList 3: " + list3);
		printDuplicates(list3);
	}
}

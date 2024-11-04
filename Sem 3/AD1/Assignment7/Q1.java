package Assignment7;

public class Q1 {
	public static Integer findFirstRepeatedElement(int[] arr) {
		boolean[] seen = new boolean[getMax(arr) + 1];
		for (int num : arr) {
			if (seen[num])return num;
			seen[num] = true;
		}
		return null;
	}

	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int n : arr) {
			if (n> max) 
				max = n;
		}
		return max;
	}

	public static void main(String[] args) {
		// Example usage:
		int[] arr1 = {2, 5, 1, 3, 2, 4}; // First repeat: 2
		int[] arr2 = {1, 2, 3, 4, 5}; // No repeats
		int[] arr3 = {4, 4, 5, 6, 7}; // First repeat: 4

		System.out.println("First repeated element in arr1: " + findFirstRepeatedElement(arr1));
		System.out.println("First repeated element in arr2: " + findFirstRepeatedElement(arr2));
		System.out.println("First repeated element in arr3: " + findFirstRepeatedElement(arr3));
	}
}

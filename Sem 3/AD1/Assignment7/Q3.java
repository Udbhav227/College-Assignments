package Assignment7;

public class Q3 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5, 6};
		int n = nums.length + 1;
		int missingNumber = 0;

		// Calculate XOR of all numbers from 1 to n
		for (int i = 1; i <= n; i++) {
			missingNumber ^= i;
		}

		// Calculate XOR of all numbers in the array
		for (int num : nums) {
			missingNumber ^= num;
		}

		System.out.println("Missing Number: " + missingNumber);
	}
}

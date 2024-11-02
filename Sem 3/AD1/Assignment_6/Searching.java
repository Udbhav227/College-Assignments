import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	// Iterative Linear Search
	public static int iterativeLinearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}

	// Recursive Linear Search
	public static int recursiveLinearSearch(int[] arr, int target, int index) {
		if (index >= arr.length)
			return -1; 

		if (arr[index] == target) 
			return index; 

		return recursiveLinearSearch(arr, target, index + 1);
	}

	// Iterative Binary Search for sorted array
	public static int iterativeBinarySearch(int[] arr, int l, int r, int target) {
		while(l <= r) {
			int mid = l + (r - l) / 2;
			if (target > arr[mid])
				l = mid + 1;	
			else if (target < arr[mid])
				r = mid - 1;	
			else
				return mid;
		}
		return -1;
	}

	// Recursive Binary Search for sorted array
	public static int recursiveBinarySearch(int[] arr, int l, int r, int target) {
		if (l > r)
			return -1;
		int mid = l + (r - l) / 2;
		if (target > arr[mid])
			return recursiveBinarySearch(arr, mid + 1, r, target);
		else if (target < arr[mid])
			return recursiveBinarySearch(arr, l, mid - 1, target);
		else return mid;
	}
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {9, 3 , 8, 6, 6, 4, 1, 7, 5, 1};
		int target = 1, l = 0, r = arr.length - 1;
		int n = -1, res = -1;
		boolean search = true;
		while (search) {
			System.out.println("1: Iterative Linear Search");
			System.out.println("2: Recursive Linear Search");
			System.out.println("3: Iterative Binary Search");
			System.out.println("4: Recursive Binary Search");
			System.out.println("0: Exit Program");
			System.out.print("Search using: ");
			n = sc.nextInt();
			switch(n) {
			case 1 : 
				res = iterativeLinearSearch(arr, target);
				System.out.println("Target postion: " + res);
				break;
			case 2 : 
				res = recursiveLinearSearch(arr, target, 0); 
				System.out.println("Target postion: " + res);
				break;
			case 3 : 
				Arrays.sort(arr);
				res = iterativeBinarySearch(arr, l, r, target); 
				System.out.println("Target postion: " + res);
				break;
			case 4 : 
				res = recursiveBinarySearch(arr, l, r, target);
				System.out.println("Target postion: " + res);
				break;
			case 0:
				System.out.println("Exiting...");
				sc.close();
				return; 
			default:
				System.out.println("Invalid choice. Please choose a valid option.");
				break;
			}
			System.out.print("Perform another search? (yes/no): ");
			String response = sc.next().toLowerCase();
			search = response.equals("yes");
		}
	}

}

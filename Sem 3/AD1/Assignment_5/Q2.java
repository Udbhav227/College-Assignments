// Write a program to Merge two sorted array
public class Q2 {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7, 9, 16, 17};
		int[] arr2 = {-7, 2, 4, 6, 8, 10, 12};
		
		System.out.print("Array a: ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nArray b: ");
		for (int j : arr2) {
			System.out.print(j + " ");
		}
		
		int[] merged = merge(arr1, arr2, new int[arr1.length + arr2.length]);
		
		System.out.print("\nArray c: ");
		for (int n : merged) {
			System.out.print(n + " ");
		}
	}
	
	public static int[] merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i != a.length && j != b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		
		while (i < a.length)
			c[k++] = a[i++];
		
		while (j < b.length)
			c[k++] = b[j++];
		
		return c;
	}
}

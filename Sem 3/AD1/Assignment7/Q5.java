package Assignment7;

public class Q5 {
	public static int findMaxFreqElement(int[] nums) {
		int maxValue = getMax(nums);
		int[] freq = new int[maxValue + 1];
		
		for (int n : nums) {
			freq[n]++;
		}
		
		int maxFreq = 0;
		int maxFreqElement = 0;
		for (int i = 0; i <= getMax(nums); i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
				maxFreqElement = i;
			}
		}
		
		return maxFreqElement;
	}
	
	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int n : arr) {
			if (n> max) 
				max = n;
		}
		return max;
	}
}

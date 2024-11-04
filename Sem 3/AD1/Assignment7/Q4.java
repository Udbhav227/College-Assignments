package Assignment7;

import java.util.Arrays;

public class Q4 {
	public static int[] findMaxDiffPair(int[] arr) {
		int minEle = arr[0];
    int maxEle = arr[0];
    for (int i = 1; i < arr.length; i++) {
        minEle = Math.min(minEle, arr[i]);
        maxEle = Math.max(maxEle, arr[i]);
    }

    return new int[]{maxEle, minEle};
	}
	
//	public static int[] findMinDiffPair(int[] arr) {
//		int minDiff = Integer.MAX_VALUE;
//		
//		return 
//	}
}

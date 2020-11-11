package leetcode;

import java.util.Arrays;

public class Q201106 {
	// int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
	// By using array create a method which returns the following list
	// [3, 5+1, 2+7+9, 2+3+5+7] ==> [3, 6, 18, 17]
	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7, 10 };
		System.out.println(sumFibList(arr));
	}

	public static String sumFibList(int[] arr2) {
		double Narrlenght;
		Narrlenght = Math.sqrt(arr2.length * 2 ;
		System.out.println(" length of new array "+ Narrlenght);
		int c = (int) Narrlenght;
		if ((c * (c + 1) / 2) == arr2.length) {
			int[] arrSumFB = new int[c];
			for (int a = 1; a < (c + 1); a++) {
				Integer sum = 0;
				for (int b = 0; b < a; b++) {
					int s = (a * (a + 1) / 2) - a;
					sum = sum + arr2[s + b];
				}
				arrSumFB[a - 1] = sum;
				sum = 0;
			}
			return Arrays.toString(arrSumFB);
		} else {
			return "Please give an array that fits in Fibonachi Triangle";
		}
	}
}

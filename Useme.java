package testpackage;

import java.util.Arrays;

public class Useme {
	public static void main(String[] args) {
		Test2 k = new Test2();
		int[] data = { -2, 45, 0, 11, -9 ,885};

		k.bubbleSort(data);

		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(data));
	}
}

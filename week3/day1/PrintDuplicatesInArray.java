package assignment.week3.day1;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = a.length;
		Arrays.sort(a);
		for (int i = 0; i < (len-1); i++) {
			for (int j = i+1; j < len; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}		
		}
	
	}
}

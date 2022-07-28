package assignment.week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		int len1 = text1.length();
		int len2 = text2.length();
		if (len1 == len2) {
			System.out.println("The Length af the given strings are same"); 
		}
		char[] a = text1.toCharArray();
		char[] b = text2.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		Arrays.sort(b);
		System.out.println(b);
		if (Arrays.equals(a, b)) {
			System.out.println("The given strings are same");
		} else {
			System.out.println("The given strings are not same");
		}
	}	

}

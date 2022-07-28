package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] a = text.split(" ");
		Set<String> dupset = new LinkedHashSet<String>(Arrays.asList(a));
		List<String> b = new ArrayList<String>(dupset);
		System.out.println(b);
		for (int i = 0; i < (b.size()-1); i++) {
			if (b.get(i)==b.get(i+1)  ) {
				System.out.println(b.get(i));
			}
		}	
	}

}

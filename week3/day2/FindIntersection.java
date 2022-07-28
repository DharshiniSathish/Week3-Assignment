package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {3,2,11,4,6,7};
		Set<Integer> a =new LinkedHashSet<Integer>();
		a.add(3);a.add(2);a.add(11);a.add(4);a.add(6);a.add(7);
		//int[] b = {1,2,8,4,9,7};
		Set<Integer> b =new LinkedHashSet<Integer>();
		b.add(1);b.add(2);b.add(8);b.add(4);b.add(9);b.add(7);
		System.out.println(a);System.out.println(b);
		//List<Integer> x = new ArrayList<Integer>(a);
		//List<Integer> y = new ArrayList<Integer>(b);
		System.out.println("Intersection in List");	
		//x.retainAll(y);
		//System.out.println(x);
		a.retainAll(b);
		System.out.println(a);
				
	}
		
		
}



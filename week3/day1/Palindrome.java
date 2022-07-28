package assignment.week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not
	     String a = "madam";
	     String rev="";
	     System.out.println(a);
	     for (int i = (a.length()-1); i >=0 ; i--) {
	    	 rev = rev + a.charAt(i);	
	    }
	     System.out.println(rev);
	     if (a.equals(rev)) {
			System.out.println("The given word is Palindrome");
		} else {
			System.out.println("The given word is  not Palindrome");
		}
	}

}


package week2.day2;

public class Assignment5Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev + s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(rev)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("Not an palindrome");
		}
	}

}

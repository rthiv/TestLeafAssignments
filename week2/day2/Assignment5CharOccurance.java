package week2.day2;

public class Assignment5CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char c='e';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {    
				count =count +1;
			}
		}
		System.out.println("Number of occurence of " + c + " is: " + count);
	}

}

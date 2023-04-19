package week2.day2;

import java.util.Arrays;

public class Assignment5Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stopss";
		String text2 = "potsss";
		boolean isBoolean=false;
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for(int i=0;i<charArray1.length;i++) {
					if(charArray1[i]==charArray2[i]) {
						isBoolean=true;
					}
				}
			if(isBoolean==true) {
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("It is not an Anagram");
			}
				
		}
		else {
			System.out.println("It is not an Anagram");
		}
	}

}

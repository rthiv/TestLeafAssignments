package week2.day2;

import java.util.Arrays;

public class Assignment5ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String output="";
		String rev="";
		String[] words = test.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i==0) {
				output=output + words[i];
			}else if(i%2==0) {
				output=output + " " + words[i];
			}else {
				for(int j=words[i].length()-1;j>=0;j--) {
					rev= rev + words[i].charAt(j);
				}
				output=output + " " + rev;
			}
		}
		System.out.println(output);
	}

}

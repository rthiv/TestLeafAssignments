package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=11;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(secNum);
		for(int i=2;i<=range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}	
		}

}

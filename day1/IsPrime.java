package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean isPrime = false;
		//prime number
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				isPrime=true;
				break;
			}		
		}
		if(isPrime==false) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}

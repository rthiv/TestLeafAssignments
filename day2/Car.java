package week1.day2;

public class Car {
	
	public void carBrand() {
		System.out.println("Brand : Tata");
	}
	private int regNum() {
		return 1054;
	}
	public boolean isPuncture() {
		return false;
	}
	int multiply(int a,int b,int c) {
		return a*b*c;
	}
	public String carModel() {
		return "Model : Tiago";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.carBrand();
		int regNum = obj.regNum();
		System.out.println("Registration number: " + regNum);
		boolean puncture = obj.isPuncture();
		System.out.println("Is punctured:" + puncture);
		int output = obj.multiply(1, 2, 3);
		System.out.println("Multiplication output :" + output);
		System.out.println(obj.carModel());
		
	}

}

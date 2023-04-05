package week1.day2;

public class LearnMethods {
	
	public void printName() {
		System.out.println("Car details: ");
	}
	public String getCarName() {
		return "Tiago";
	}
	private int getNumber() {
		return 1054;
	}
	double add(double a, double b) {
		return a+b;
	}
public static void main(String[] args) {
	LearnMethods obj = new LearnMethods();
	obj.printName();
	System.out.println(obj.getCarName());
	int carNumber = obj.getNumber();
	System.out.println(carNumber);
	double add = obj.add(7.20, 2.50);
	System.out.println(add);
}
}

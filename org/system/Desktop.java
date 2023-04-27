package org.system;

public class Desktop extends Computer {
	
	public void computerSize() {
		System.out.println("Small tablet size computer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.computerSize();
	}

}

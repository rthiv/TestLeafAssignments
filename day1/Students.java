package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID is " + id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID is " + id + " and " + "Name is " + name);
	}
	public void getStudentInfo(String email,int phoneNum) {
		System.out.println("Email is " + email +  " and " + "phoneNum is " + phoneNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentInfo(3);
		obj.getStudentInfo(3, "Aarthi");
		obj.getStudentInfo("aarthi.v@gmail.com", 123456);
	}
}


package org.student;
import org.college.*;
import org.department.*;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Aarthi");
	}
	public void studentDept() {
		System.out.println("Student Dept: ECE");
	}
	public void studentId() {
		System.out.println("Student ID: 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}

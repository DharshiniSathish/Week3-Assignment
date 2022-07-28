package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Dharshini");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Design");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("XYZD005");
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

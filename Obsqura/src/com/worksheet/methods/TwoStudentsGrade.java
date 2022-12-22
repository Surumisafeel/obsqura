package com.worksheet.methods;
/*Write a program to find the grade of 2 students based on total marks(3 subjects) 
 Get the student‟s marks by constructor
 Return total mark to in main method
 Find the grade of each student*/

public class TwoStudentsGrade {
	String name;
	int mark1;
	int mark2;
	int mark3;
	char grade;

	TwoStudentsGrade(String name, int mark1, int mark2, int mark3) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;

	}
	int TotalMark(){
		int result = mark1 + mark2 + mark3;
		return result;
	}

	void  FindGrade(int result) {
		
		if (result > 150) {
			grade = 'A';
		} else
			grade = 'B';
		


	}

	public static void main(String[] args) {

		TwoStudentsGrade obj = new TwoStudentsGrade("surumi", 50, 60, 70);
		int student1Total = obj.TotalMark();
		obj.FindGrade(student1Total);
		System.out.println("Total mark of " + obj.name + "is " + student1Total + "and grade is " + obj.grade);

		TwoStudentsGrade obj1 = new TwoStudentsGrade("safeel", 90, 70, 70);
		int student2Total = obj1.TotalMark();
		obj1.FindGrade(student1Total);
		System.out.println("Total mark of " + obj1.name + "is " + student2Total + "and grade is " + obj1.grade);

	}
}

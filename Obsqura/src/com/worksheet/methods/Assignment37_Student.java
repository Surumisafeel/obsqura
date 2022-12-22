package com.worksheet.methods;

/*. Write a program to get the details of a Student
 Class 1 - Student
Get the student name and roll number
 Class 2- Address
Get the address of student
Print Student name, roll number with address
 There is no IS-A relationship*/
public class Assignment37_Student {
	String student_Name;
	int roll_Number;
   Assignment37_Address adr;

public  Assignment37_Student(String student_Name, int roll_Number, Assignment37_Address adr) {
	//this.student_Name =student_Name;
	this.roll_Number=roll_Number;
	this.adr= adr;
	}



public void display(){
	
	System.out.println("Name of student" +this.student_Name);
	System.out.println("Roll number of student"+ roll_Number);
	System.out.println("District of student" +adr.district );
	System.out.println("state of student is "+adr.state);
	
}


	
	public static void main(String[] args) {
		Assignment37_Address adr = new Assignment37_Address("TVM","Kerala");
		Assignment37_Student stu = new Assignment37_Student("Surumi",567,adr);
		stu.display();
}
}

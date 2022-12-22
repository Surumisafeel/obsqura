package com.notes.constructorUses;

public class ConstructorChaningExample2 {
	
	    String name;
	    int rollNo;
	    int marks ;
		
	    ConstructorChaningExample2(String name,int rollNo){
	        this.name = name;
	        this.rollNo = rollNo;
	    }
	    ConstructorChaningExample2(String name, int rollNo,int marks){
	        this(name,rollNo);
	        this.marks = marks;
	    }
	    void displayNameRollNo(){
	        System.out.println("Name: "+name);
	        System.out.println("Roll No : "+rollNo);

	    }
	    void displayNameMarks(){
	        System.out.println("Name: "+name);
	        System.out.println("Roll No : "+rollNo);
	        System.out.println("Marks :"+marks);
	    }
	    public static void main(String[] args){
	        System.out.println("First Student");
	        ConstructorChaningExample2 stu1 = new ConstructorChaningExample2("ram",12);
	        stu1.displayNameRollNo();
	        System.out.println("Second Student");
	        ConstructorChaningExample2 stu2 = new ConstructorChaningExample2("jai",34,90);
	        stu2.displayNameMarks();
	    }
	}



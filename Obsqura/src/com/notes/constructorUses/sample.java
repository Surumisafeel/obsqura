package com.notes.constructorUses;

public class sample {

	    //instance variable.
	    int rollNo;
	    String name;
	    sample(String name, int rollNo){
	        //local variable.
	        name = name;
	        rollNo = rollNo;
	    }

	    public void displayDetails(){
	        System.out.println("RollNo = " + rollNo);
	        System.out.println("name = " + name);
	    }
	    public static void main(String[] args){
	    	sample obj = new sample("jai",41);
	        obj.displayDetails();
	    }
	}



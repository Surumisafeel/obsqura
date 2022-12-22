package com.notes.constructorUses;
/*this can be used to invoke current class method implicitly.
Method chaining:
Method chaining is a process of calling multiple methods on an object in a single statement.
*/
public class MethodChaining {


    public void displayName(){
        System.out.println("Name : Jai");
    }
    public void displayRollNo(){
        System.out.println("Roll Number : 34");
    }
    public void displayMarks(int mark){
        this.displayName();
        this.displayRollNo();
        System.out.println("Marks : " +mark);

    }
    public static void main(String[] args){
    	MethodChaining obj3 = new MethodChaining();
        obj3.displayMarks(90);
    }
}



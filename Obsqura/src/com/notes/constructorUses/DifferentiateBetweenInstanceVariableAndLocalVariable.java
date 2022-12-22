package com.notes.constructorUses;

public class DifferentiateBetweenInstanceVariableAndLocalVariable {
	String name;
    String dept;
    public void display(String name,String dept){
        this.name = "Giri";
        this.dept ="IT";
        System.out.println(this.name);//instance varaible
        System.out.println(this.dept);
        System.out.println(name);//local variable
        System.out.println(dept);
    }

    public static void main(String[] args) {
    	DifferentiateBetweenInstanceVariableAndLocalVariable obj =new DifferentiateBetweenInstanceVariableAndLocalVariable();
        obj.display("reshma","it");
    }
}



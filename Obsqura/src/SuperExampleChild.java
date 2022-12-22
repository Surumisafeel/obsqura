
public class SuperExampleChild extends SuperExampleParent {

	void Add() {
		int a = 3;
		int b = 5;
		int sum = a + b;
	}

	void Display() {
		super.Add();
		System.out.println("Result is " + super.result);

	}

	public static void main(String[] args) {
		SuperExampleChild obj = new SuperExampleChild();
		obj.Display();
	}

}

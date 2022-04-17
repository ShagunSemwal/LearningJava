package Unit_02;

public class P13_Assignment_Quention_Unit02 {

	public static void main(String[] args) {
		
		Assignment_Quentions_Unit02 obj = new Assignment_Quentions_Unit02();
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();
	}

}

class Assignment_Quentions_Unit02 {
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	
	void overloadingAndOverriding() {
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	
	void accessProtectionInJava() {
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
		
	}
	
	void interfaceImplementation() {
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2{
	
	int a = 10; //default protection!
	public int b = 20; //can be accessed outside Unit02 Package but within same project
	protected int c = 30;//can only be accessed within Unit02 Package
	private int d = 40; //within ParentClass only, not even in its sub-class
	
	void showData() {
		System.out.println("Inside Sample2 ParentClass");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
	}
	
	public void display() {
		System.out.println("This is a display method inside abstract class Sample2! ");
	}
	
	abstract public void run(); //unimplemented method
}

class Sample3 extends Sample2 implements A3, B3{
	public void display() {
		System.out.println("Inside ChildClass");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		//System.out.println("d= "+d); // private member can not be accessed
	}
	
	public void display1() {
		System.out.println("This is display1 method in child class Sample3 from interface");
	}
	
	public void display2() {
		System.out.println("This is display2 method in child class sample3 from interface");
	}
	
	public void run() {
		System.out.println("This is run method from abstract class sample2!");
	}
	
	public void run(int x) {
		System.out.println("This is run overloaded method in sample3!");
	}
	public void run(int x,int y) {
		System.out.println("This is run overloaded method in sample3!");
	}
}

interface A3{
	public void display1();
}

interface B3{
	public void display2();
}
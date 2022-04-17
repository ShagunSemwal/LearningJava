package Unit_02;

/*
 * Abstract Class:
 * -AN abstract class must be declared with an abstract keyword.
 * 
 * -Abstraction is a process of hiding the implemented details and showing only functionality{function declaration}
 *    to the user.
 *  -can not make object of abstract class directly,but through derived class{can not be instantiated}.
 *  
 *  Final Class:
 *  - The main purpose of using a class being declared as final is to prevent the class from being subclasses.
 *  	-if a class is marked as final then no class can inherit any feauture from the final class.
 *  	-You can not extend a final class. if you try it gives you a compile time error.
 */

abstract class Bike{
	int a;
	Bike(){
		System.out.println("inside Bike Constructor: "+ a + "\n");
	}
	
	abstract void run();  //abstract method! (0-100%)
	
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike{

	@Override
	void run() {
		
	}
	
}

public class P09_Task02_AbstractInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		//obj.run();
		obj.display();
		
		//can not be instantiated
		// Bike obj2 = new Bike();
	}

}

//Final Class
final class Super{
	public int data = 30;
	
	void display() {
		System.out.println(data);
	}
}
/*
public class sub extends Super{
	void display2(){
		display();
 	}
 }
*/
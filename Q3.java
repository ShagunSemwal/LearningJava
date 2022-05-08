


import java.util.Scanner;

interface In1{
	void display(int p);
}
class testClass implements In1{	
	public void display(int p) {
		if(p%2==0)
			System.out.println(p+" is prime number");
		else
			System.out.println(p+" is not a prime number");
	}
}

public class Q3 {

	public static void main(String[] args) {
		testClass obj = new testClass();
		obj.display(5);
		

	}

}
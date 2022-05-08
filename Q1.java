

import java.util.Scanner;

class Students{
	String name;                                //declaration part
	int age;
	static int i=0;
	char section='A';
	static float []percentage= new float [6]; //static variable
	float avg = 0.0f,total;
	
	Students(){                  // constructor
		Scanner sc = new Scanner(System.in); //scanner class
		System.out.println("enter name: ");
		name = sc.next();				//user inputs
		System.out.println("enter age: ");
		age = sc.nextInt();
		System.out.println("enter percentage: ");
		percentage[i]= sc.nextFloat();
		i++;
		
	}
	void avgPercentage() { //methods

		for(int i=0;i<6;i++) {
			total +=percentage[i];
			avg = total/6.0f;
		}
	}
	void display() { //display method
		System.out.println("section "+section);
		System.out.println("Total average is : "+ avg);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj= new Students(); //objects of class students 
		Students obj1= new Students();
		Students obj2= new Students();
		Students obj3= new Students();
		Students obj4= new Students();
		Students obj5= new Students();
		
		
		obj.avgPercentage();  //calling
		obj.display(); 
	}

}
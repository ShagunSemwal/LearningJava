package Assignment_01;

import java.util.Scanner;

class Employee{
	String name;
	int age;
	String depart;
	int salary;
	static int total,total1,total3,total4;
	
	Employee(){
		//Default one
	}
	
	Employee(String name,int age,String depart,int salary){
		this.name = name;
		this.age = age;
		this.depart = depart;
		if(salary > 30000)
			this.salary = 25000;
		else
			this.salary = salary;
		
	}
	public void compute(Employee arr[]) {
		for(int i=0;i<8;i++) {
			if(arr[i].depart.equals("A"))
				total += arr[i].salary;
			else if(arr[i].depart.equals("B"))
				total1 += arr[i].salary;
			else  if(arr[i].depart.equals("C"))
				total3 += arr[i].salary;
			else
				total4 += arr[i].salary;
		}
	}
	public void totalSalary() {
		System.out.println("total salary of department A: "+total);
		System.out.println("total salary of department B: "+total1);
		System.out.println("total salary of department C: "+total3);
		System.out.println("total salary of department D: "+total4);
	}
}

public class Q5 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[8];
		String name;
		int age;
		String depart;
		int salary;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< 8;i++) {
			System.out.print("name: ");
			name= sc.next();
			System.out.print("age: ");
			age = sc.nextInt();
			System.out.print("depart: ");
			depart = sc.next();
			System.out.print("salary: ");
			salary = sc.nextInt();
			
			arr[i]= new Employee(name,age,depart,salary);
			
		}
		

		Employee result = new Employee();
		result.compute(arr);
		result.totalSalary();
	}

}
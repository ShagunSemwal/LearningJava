package Unit_03;

import java.util.Scanner;

public class P16_Multithreading {

	public static void main(String[] args) {
	/*	c1 obj1 = new c1();
		obj1.show();
		System.out.println(" ");
		c2 obj2=new c2();
		obj2.show2();
	*/
		
		Thread T1=new Thread(new T1(),"T1");
		Thread T2=new Thread(new T2(), "T2");
		
		T1.start();
		T2.start();
	}

}
class c1{
	void show() {
		 for(int i=0; i<10; i++) {
			 System.out.println(i+"-hey1");
			 }
		 }
	}
class c2{
	void show2() {
		for(int i=0; i<10; i++)
		{
			System.out.println(i+"-hey2");
		}
	}
}
class T1 extends Thread{
	public void run() {
		    Scanner obj = new Scanner(System.in);
		    int a=obj.nextInt();
		    System.out.println(a);
			System.out.println("Done with T1");
			obj.close();
		}
		}
class T2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(i+"-hey2");
		}
	}
	}
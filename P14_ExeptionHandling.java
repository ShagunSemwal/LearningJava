package Unit_03;
import java.io.*;
import java.util.InputMismatchException;
//import java.util.ArithmeticException;
import java.util.Scanner;

class NullPointerException{
	
}
 class A{
	int a=7,b=0,result;
	static int i = 0;
	
	
	
	void handleException() {
		try {
		result = a/b;
		System.out.println(result);
	}
	
		catch  (Exception e ) {
			System.out.println("/ by  zero");
			System.out.println(e);
		}
		
		System.out.println("end f program");
		}
	
	void basicException() {
		
		 result = a/b;
		System.out.println(result);
	
	
	
	
	}
	
	void multipleCatch() {
		try {
			int number[]= new int [10];
			number[10] = 30/0;
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of size of the array");
		}
		catch(Exception e) {
			System.out.println("zero cannot divide any number");
		}
	}
	
	void inputMismatchException() {
		Scanner sc = new Scanner(System.in);
		try {
			Integer c = sc.nextInt();
			System.out.println((c*c));
		}
		
		catch(InputMismatchException ex){
			System.out.println(ex);
		}
	}
	
	public static int stackOverFlowError(int x) {
		i = i+2;
		System.out.println(i);
		return i+ stackOverFlowError(i+2);
	}
	
	
	void indexOutOfBoundException() {
		int [] arr = {12,34,56,78,23,67};
		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();
		System.out.println("elemnet in the given index is :: "+arr[ele]);
	}
	
	void nullPointerException() {
		String s = null;
		try {
			System.out.println(s.length());
			
		}
		
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	void useOfThrowsFinally(){
		
		    int a[] = new int[2];
		    try
		    {
		      System.out.println("Access invalid element"+ a[3]);
		      /* the above statement will throw ArrayIndexOutOfBoundException */
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("Exception caught");
		    }
		    finally
		    {
		      System.out.println("finally is always executed.");
		    }
		  
	}
	void checkedAndUncheckedException() {
		int n;
        FileInputStream fis;
        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file. Please check file name and path");
            return;
        }

	}
 }
public class P14_ExeptionHandling {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println("Hello");
		NullPointerException e = new NullPointerException();
		throw e;
		System.out.println("Hw are you");
		obj.useOfThrowsFinally();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		obj.checkedAndUncheckedException();
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		//obj.stackOverFlowError(0);
		obj.basicException();
		
		
	}

}
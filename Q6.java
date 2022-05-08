package Assignment_01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Operation obj = new Operation();
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter two  number for a & b");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int z = (a>b)? obj.add(a,b):obj.sub(a,b);
		System.out.println("The result is : "+z);
	}

}

class Operation{
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a,int b) {
		int res = a-b;
		if(res<0)
			return 0;
		return res;
	}
}
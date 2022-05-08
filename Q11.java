package Assignment_01;
ackage Assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Operations obj = new Operations();
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter two  number for a & b");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int z = (a>b)? obj.add(a,b):obj.sub(a,b);
		System.out.println("The result is : "+z);
	}

}

class Operations{
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
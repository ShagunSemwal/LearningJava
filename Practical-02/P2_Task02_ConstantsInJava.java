package Unit_01;

/*- Piece of data/code that would never change.*/

public class P2_Task02_ConstantsInJava {
	private static final double Pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10;
		//a=11;
		
		//cannot make a static reference to the non-static field Pi
		System.out.println(Pi);
		System.out.println(a);
		
		
		//can not make a static references to the non-static method add(int,int) from
		//the type P2_Task02_ConstantInJava
		add(1,2);
		
		multi(1,2);
		
		calculator obj= new calculator();
		System.out.println(obj.add(1,2));
		System.out.println(obj.a);
	}
	
	static int add(int a,int b) {
		System.out.println(a);
		
		System.out.println(Pi);
		
		return (a+b);
	}
	
	static int multi(int a,int b) {
		return (a*b);
	}
}

class calculator{
	int a=10;
	int add(int a,int b) {
		//System.out.println(Pi);
		
		return (a+b);
	}
	
	int multi(int a,int b) {
		return (a*b);
	}
}
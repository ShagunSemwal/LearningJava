package Unit_01;

/*
 * operator in java is a symbol that is used to perform operations.
 * sum= a+b;
 * 	for eg. +, -, *, / etc.
 * 
 *-> a+=1; // a=a+1;
 *
 *Types of operators in Java
 *	-Unary operator:      {prefix and post fix) [a++,a--,++a,--a,-a,!a]
 *	-Arithmetic operators: {+,/,%,+,-}
 *	- Shift operators: {<<  >>}
 *	-Relational operators: {< >  <= >=  ==  !=}
 *	-Bitwise operator: {& ^ |}
 *	-Logical operator: { && ||}
 *	-Ternary operator: {? :}
 *	-Assignment Operator: {= += -= *= /= %= &= <<= >>=}
 */
public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorsInJava obj= new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssignmentOperator();
		
	}

}

class OperatorsInJava {
	
	void UnaryOperator() {
		
		int a=10;
		boolean b= false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++); //10
		System.out.println(a--); //11
		System.out.println(++a); //11
		System.out.println(--a); //10
		
		/*
		 * Bitwise Complement(~)
		 * This unary operator returns the one's complement representation of input value
		 * with all bits inverted, which menas it makes every 0 to 1,and every 1 to 0.
		 */
		System.out.println(~a); //1010 invert all bits=> 0101 2's comp => 1010+1= 1011
		
		//'NOT' operator (!): it is used to reverse the value of an operand
		System.out.println(!b); //true
		System.out.println("\n");
		 
	}
	
	void ArithmeticOperator() {
		System.out.println("Inside ArithmeticOperator");
		int a=10;
		int b=5;
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		
		//what is output?
		System.out.println(((10 *10)/5)+3-((1*4)/2));
		System.out.println("\n");
	}
	
	void ShiftOperator() {
		System.out.println("Inside ShiftOperator");
		
		System.out.println(10<<2); //10*2^2=10*4=40
		System.out.println(10<<3); //80
		System.out.println(20<<2); //80
		System.out.println(15<<4); //240
		
		System.out.println("\n");
	}
	
	//result is true or false
	
	void RelationalOperator() {
		System.out.println("Inside RelationalOperator");
		
		int a=10;
		int b=20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		
		System.out.println("\n");
		
	}
	
	//Bitwise second condition is also checked but not in logical && and even in ||
	void BitwiseAndLogicalOperator() {
		System.out.println("Inside BitwiseAndLogicalOperator");
		int a=10;
		int b=5;
		int c=20;
		
		//logical && and bitwise &
		System.out.println(a<b && a++<c); // false && true = false
		System.out.println(a);   //10 because second condition is not checked
		
		System.out.println(a<b & a++<c); //false && true =false
		System.out.println(a); // 11
		
		// logical || and Bitwise |
		System.out.println(a>b || a++<c); // true || true =true
		System.out.println(a); //10
		System.out.println(a>b | a++<c); //true
		System.out.println(a); // 11
		
	}
	
	void TernaryOperator() {
		System.out.println("Inside TernaryOperator");
		
		int a=2;
		int b=5;
		int min=(a<b)? a:b;
		System.out.println(min);
		System.out.println("\n");
		
		
	}
	void AssignmentOperator() {
		System.out.println("Inside AssignmentOperator");
		int a=10;
		int b=20;
		a+=4; 
		b-=4;
		System.out.println(a);
		System.out.println(b);
		
	}
}
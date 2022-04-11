package Unit_01;

/*
 * 
 * - 50 such keywords[reserved words], meanings are defined by the compiler
 * - 48 + 2
 * - 48 use
 * - 2 for future use[ goto*,const*]
 * 
 * Future use: goto*,const*
 * 1.2 V  :  assert**
 * 1.4 V  : strictfp***
 * 5.0 V : enum****
 * 
 * 
 * - Keywords: can not be used as identifiers in Java [ int a=10;]
 * 		-object
 * 		-variable name
 * 		-function
 * 		-class
 * 		-etc.
 * 
 */

public class P2_Task01_IncorrectKeywoardsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first class!");
		
		
		
		//variable name
		//syntax error on token "double",invalid VariableDeclaratorId
		
		/*int double=12;*/int p=12;
		
		//function name
		int new() {
			
			//sysout[ctrl+space]
			System.out.println("function name!");
			
			return 0;
		}
		
		int a=10;
		a=11;
		
		//class name [Given below]
		
		//object
		//object name can never be any keywords in java
		/*ABC int = new ABC();*/ ABC j= new ABC();
		//obj.display();
		
	}

}

//class name can never be any keywords we have in java
class int {
	
	void display() {
		System.out.println("Another Class!");
	}
}
class ABC{
	void display() {
		System.out.println("Another Class!");
	}
}
package Unit_01;

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}

}

class StringInJava{
	
	void StringDefinition() {
		String s= "Hello There";
		String s1= new String("hgjhgjf");
		
		System.out.println(s);
		
		// get length of a string
		System.out.println(s.length());
		
		//loop through a string!
		for(int i=0 ;i< s.length();i++)
			System.out.println(s.charAt(i));
		
		String first = "Prerna";
		String second= "Butola";
		
		//compare two string;
		boolean result1= first.equals(second);
		System.out.println(result1);
		
		/* Java strings are Immutable 
		 * In java, the JVM maintains a string pool to store all of its strings inside the memory.
		 * The string pool helps in reusing the strings.
		 * 	-if the string already exists, the new string not created
		 	Instead, the new references, example points to the already existed string (java).
		 	-if the string doesn't exist, the new string (Java is created)
		 */
		String fourth= "Prerna";
		String fifth= new String("Butola");
	}
	/*
	 * Character Arrays are mutable but Strings are not
	 */
	void charAndString() {
		char[] ch= {'H','e','l','l','o',' ','T','h','e','r','e','!'};
		char[] ch2= {'!','!'};
		
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		
		String s1= new String(ch);
		System.out.println(s1);
		
		//character arrays are mutable but strings are not!
		ch[0]='h';
		//s1.charAt(0) = 'h';
		
		/*
		 * Join Two Java Strings -+' can be used to appended strings together to form a
		 * new string - but not possible in char array 
		 */
		s1 = s1 +'a'; // s1 is new object with new memory
		//ch = ch+ch2;
		String s2= "Mango";
		
		char[] ch4 = s2.toCharArray();
		
		// char array to string
		char[] a2= {'p','o','p'};
		String s3= new String(a2);
		}
}
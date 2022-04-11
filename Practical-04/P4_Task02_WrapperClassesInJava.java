package Unit_01;

/*
 * The wrapper class in java provides the mechanism to convert primitive into object and object.
 * why?
 * Because we want to use predefined methods of those objects
 * -boolean data types -> Boolean obj; -> obj.tostring();
 */
public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting int into Integer
		int a=20;
		
		String s= "" +a + "";
		Integer i= Integer.valueOf(a); //converting int into Integer explicitly
		Integer j= a; // autoboxing. now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" " +i + " " +j);
		System.out.println(i.toString());
		
		//a.tostring() can not be done due to a int not object
		
		//Autoboxing : Converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		System.out.println(byteobj);
		
		//Unboxing : Converting objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
			
		
	}

}
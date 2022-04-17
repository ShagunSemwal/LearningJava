package Unit_02; //Inside this pakages we can create many classes:

/*
 -A java packages is a group similar types of classes, interface and sub-pakages.
 -Packages in java can be categorised in two form
  	-built-in package (long, javax, owt, swing , net, io, util , sql) 
  	-user-defined package
 
 - Package also helps to avoid class name collision
 - Package also helps us to maintain access protection in Java
 -Package are named in reverse order of domain names
  	- unit01.javaproject.com -> "com.javaproject.unit01"
  	
 import java.util.vector; // import the vector class from util packages
 import java.util.*; //import all the classes from util package
 
 static import:
 -static import is a feature introduced in Java programming language {version 5 and above 5}
 -that allows members {fields and methods } defined in a class as public static to
 be used in java code without specifying the class in which the field is defined 
 */

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1;
public class P11_Task02_ImportingAndPakagesInJava {

	public static void main(String[] args) {
		
		out.println("welcome to package");
		
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.344));
		
		SampleClass1 obj =  new SampleClass1();
		System.out.println(obj.a);
	}

}
package Assignment_01;

class ClassOne{
	ClassOne(int x){
		System.out.println("inside first constructor");
	}
}

class ClassTwo extends ClassOne{
	ClassTwo(){
		super(4);
		System.out.println("inside second constructor");
	}
}

class ClassThree extends ClassTwo{
	ClassThree(int x){
		System.out.println("inside third parametrized constructor");
	}
	ClassThree(){
		System.out.println("inside third default constructor");
	}
}
public class Q4 {

	public static void main(String[] args) {
		
		ClassThree obj = new ClassThree(1);
		ClassThree obj1 = new ClassThree();
		
	}

}
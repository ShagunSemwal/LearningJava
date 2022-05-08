package Assignment_01;


class MainMethod {
	//private int id;
	//public String name;
	static int count = 0;
	
	MainMethod(){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter id: ");
		id = sc.nextInt();
		System.out.println("enter name: ");
		 name = sc.next(); */
		count++;
	}
	void display() {
		//System.out.println("name is: "+name);
		//System.out.println("id is: "+id);
		System.out.println("Total no of count: "+count);
	}
	
}



public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMethod obj  = new MainMethod();
		MainMethod obj3 = new MainMethod();
		MainMethod obj4 = new MainMethod();
		MainMethod obj5 = new MainMethod();
		MainMethod obj6 = new MainMethod();
		
		obj.display();
	}

}
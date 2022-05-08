package Assignment_01;
ackage Assignment_01;
class Main_Method {
	//private int id;
	//public String name;
	static int count = 0;
	
	Main_Method(){
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



public class Q7 {

	public static void main(String[] args) {
		Main_Method obj  = new Main_Method();
		Main_Method obj3 = new Main_Method();
		Main_Method obj4 = new Main_Method();
		Main_Method obj5 = new Main_Method();
		Main_Method obj6 = new Main_Method();
		
		obj.display();
	}

}
package JavaBasicByNaveen;

public class StaticvsNonstatic {
	
	public int age =12;
	static int year = 1990;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling static variables directly
		System.out.println("********calling static variables directly*********");
		name();
		System.out.println(year);
		
		//calling static variable using class name
		System.out.println("********calling static variable using class name********");
		StaticvsNonstatic.name();
		System.out.println(StaticvsNonstatic.year);
		
		//calling non-static varible we have to create object
		System.out.println("********* calling Non-Static variable using object reference variable");
		StaticvsNonstatic sns = new StaticvsNonstatic();
		sns.age();
		System.out.println(sns.age);
		
	}
	
	public static void name() {
		System.out.println("Deepika");
	}
	
	public void age() {
		System.out.println("My age is 12");
	}

}

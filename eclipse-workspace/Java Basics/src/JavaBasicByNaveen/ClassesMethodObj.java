package JavaBasicByNaveen;

public class ClassesMethodObj {

	public String name;
	public int price;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassesMethodObj a = new ClassesMethodObj();
		a.name = "Car";
		a.price = 12000;
		
		ClassesMethodObj b = new ClassesMethodObj();
		b.name = "Truck";
		b.price = 50000;
		
		System.out.println(a.name + b.name);
		
		ClassesMethodObj c = new ClassesMethodObj();
		
		c.add();
		c.str();
		c.div();
		String g = c.ret();
		System.out.println(g);
	}
	
	public void add() {
		System.out.println("Add variable's value");
		int a=1, b=3;
		int c = a+b;
		System.out.println(c);
	}

	 public void str() {
		System.out.println("Hello string");
	}
	
	public void div() {
		double a = 2.5, b = 2;
		double c=a/b;
		System.out.println(c);
	} 
	
	public String ret() {
		String a= "Hi", b = "Hello";
		return a+b;
		
	}
}

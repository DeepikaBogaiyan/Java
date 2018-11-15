package JavaBasicByNaveen;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		int a= 20;
		int b= 10;
		
		String w1 = "Hello";
		String w2 = "Deepika";
		
		double d = 1.5;
		double d1 = .5;
		
		//println - print line new
		System.out.println(a+b+w1+w2);
		System.out.println(a+b+w1+w2+a+b);
		System.out.println(a+b+d+d1);
		System.out.println(a+b+w1+w2+d+d1);
		
		System.out.println(a+b+w1+w2+(d+d1));
		
		//print the output in same line
		System.out.print(w1+w2);
		System.out.println(a+b+w1+w2);
	}

}

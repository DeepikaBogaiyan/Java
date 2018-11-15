package JavaBasicByNaveen;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		
		// while loop must have increment / decrement else it will execute infinite time
		 System.out.println("============While Loop==============");
		  while(a <=20) {
			 System.out.println(a);
			 a++;
		 } 
		  
		  int b= 10;
		  System.out.println("============While Loop Reverse==============");
		 while(b >= 1) {
			 System.out.println(b);
			 b--;
		 }
		 //for loop
		 System.out.println("============For Loop==============");
		 for(int i=1;i<=10; i++) {
			 System.out.println(i);
		 }

		 System.out.println("============For Loop Reverse==============");
		 for(int q=10;q>=1; q--) {
			 System.out.println(q);
		 }
		 
		 
		 //Increment
		 
		 int w=1;
		 w++;
		 System.out.println(w);
		 
		 int e=5;
		 ++e;
		 System.out.println(e);
		 
		 int r=1;
		 r--;
		 System.out.println(r);
		 
		 int t=4;
		 --t;
		 System.out.println(t);
	}

}

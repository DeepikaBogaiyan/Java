package JavaBasicByNaveen;

public class Array {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array is a collection of similar datatype 
		//It is a single dimension array
		//Array size should be defined initial
		
		int q[] = new int[2];
		q[0] = 1;
		q[1] = 2;
		System.out.println(q[0] + q[1]);

		boolean w[] = new boolean[2];
		w[0] = true;
		w[1] = false;
		System.out.println(w[1]);
		
		double e[] = new double[2];
		e[0] = 11.99;
		e[1] = 23.67;
		System.out.println(e[0]);
		System.out.println(e[1]);
		
		char a[] = new char[2];
		a[0] = 'w';
		a[1] = '2';
		System.out.println(a[0]+a[1]);
		
		String s[]= new String[2];
		s[0] = "Hello";
		s[1] = "Gnana";
		System.out.println(s[0]+s[1]);
		
		//Use Object Array for multi datatype
		Object obj[] = new Object[4];
		obj[0] = "Deep";
		obj[1] = 12.3;
		obj[2] = 'f';
		obj[3] = 24;
		
		for(int f=0;f < obj.length;f++) {
			System.out.println(obj[f]);
		}
		
		
		//ArrayList, Hash Table
		
		//Two dimensional array
		
		int arr[][] = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		arr[0][0] = 12;
		arr[0][1] = 23;
		arr[0][2] = 78;
		arr[1][0] = 45;
		arr[1][1] = 90;
		arr[1][2] = 67;
		
		for(int v=0; v<arr.length; v++) {
			for(int b=0; b<arr[0].length;b++) {
				System.out.println(arr[v][b]);
			}
		}
		//System.out.println(arr[0][0]);
	}

}

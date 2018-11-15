package JavaBasicByNaveen;

public class ValuevsRef {

	public static void main(String[] args) {
		String a ="100";
		// TODO Auto-generated method stub
		//String w;
		//System.out.print(ref(a));
		String g= ref(a);
		System.out.println(g);
	}

	
	public static String ref(String w) {
		w = "call by reference";
		return w;
	}
}

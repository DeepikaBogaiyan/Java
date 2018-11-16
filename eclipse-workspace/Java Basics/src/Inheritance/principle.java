package Inheritance;

public class principle extends hod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hod hodaccess = new hod();
		System.out.println("============Staff Members=================");
		hodaccess.staff();
		System.out.println("============Asst. Prof.=================");
		hodaccess.asstProf();
		
		mentors ment = new mentors();
		System.out.println("=============Group1 Students=================");
		ment.stugroup1();
		System.out.println("=============Group2 Students=================");
		ment.stugroup2();
		System.out.println();

	}

}

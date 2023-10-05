package basicprogram;

public class Vanmathi extends Simple{
	public void studentName(String name) {
		System.out.println(name);
	}
	public void studentName(int age) { 
		System.out.println(age);
	}
	public void studentName(float marks) {
		System.out.println(marks);
	}
public static void main (String[]args) {
	Vanmathi obj=new Vanmathi ();
			obj.studentName("vanmathi");
			obj.studentName(22);
			obj.studentName(92);
			
	
}
}


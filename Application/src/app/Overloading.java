package app;

public class Overloading {
	public void studentDetails(int id) {
		System.out.println(id);
	}
    public void studentDetails(String name) {
    	System.out.println(name);
	}
     public void studentDetails(float salary) {
    	 System.out.println(salary);
     }
	
public static void main(String[]args) {
	Overloading obj = new Overloading();
	obj.studentDetails("shree");
	obj.studentDetails(2);
	obj.studentDetails(3637);
}
}

package Priya;

public class Hdfc extends Banking{
	public void current() {
		System.out.println("Saving");
		}
	public void jointacc() {
		System.out.println("joint");
		}
	public void salary() {
		System.out.println("Salary");
		}
	public static void main (String[]args) {
		Hdfc obj=new Hdfc();
	    obj.saving();
	    obj.joint();
	    obj.salary();
	}
}

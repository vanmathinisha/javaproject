package app;

public class Son1 extends Father{
	public void educations(){
		System.out.println("arts");
	}
	public static void main(String[]args) {
		Son1 obj = new Son1();
		obj.bussiness();
		obj.property();
		obj.educations();
		
	}

}

package app;

public class Son extends Father{
	public void education(){
		System.out.println("Eng");
	}
	
	public static void main(String[]args) {
		Son obj = new Son();
		obj.bussiness();
		obj.education();
		obj.property();
		
	}
}

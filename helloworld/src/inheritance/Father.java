package inheritance;

public class Father extends Son {
	public void name() {
		System.out.println("aaa");
	}
	public static void main(String[]args) {
		Son t=new Son();
		t.name();
	}
	

}

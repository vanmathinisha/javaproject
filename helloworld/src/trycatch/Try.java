package trycatch;

public class Try {
	public static void main(String[]args) {
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("should be divided by zero");
			
		}
	}
}

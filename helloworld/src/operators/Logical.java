package operators;

public class Logical {
	public static void main(String[]args) {
		int num1=10;
		int num2=5;
		System.out.println((num1<num2)&&(num1>=num2));
		System.out.println((num1<num2)||(num1>=num2));
	    System.out.println(!(num1<num2)|| !(num1>=num2));
	}

}

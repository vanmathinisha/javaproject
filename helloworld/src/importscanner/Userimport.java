package importscanner;

import java.util.Scanner;

public class Userimport {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your details");
		
		String name=obj.nextLine();
		System.out.print("user name:" + name);
		
		int age=obj.nextInt();
		System.out.print("user age:"+ age);
		
		boolean gender=obj.nextBoolean();
		System.out.print("user gender:"+gender);
		
		
	}

}

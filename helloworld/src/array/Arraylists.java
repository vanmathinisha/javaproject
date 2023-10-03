package array;

import java.util.ArrayList;

public class Arraylists {
	public static void main(String[]args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("pink");
		color.add("blue");
		color.add("red");
		color.add("white");
		color.set(0,"black");
		color.set(2,"grey");
		color.remove(3);
	    System.out.println(color);
		System.out.println(color.get(1));
		
		
	}

}

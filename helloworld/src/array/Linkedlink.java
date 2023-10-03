
package array;

import java.util.LinkedList;

public class Linkedlink {
	public static void main (String[]args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("pink");
		color.add("yellow");
		color.add("blue");
		color.add("white");
		color.addFirst("purple");
		color.addLast("violet");
		color.removeLast();
		System.out.println(color);
		
	}	

}

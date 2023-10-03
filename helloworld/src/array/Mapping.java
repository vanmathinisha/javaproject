package array;

import java.util.HashMap;

public class Mapping {
	public static void main(String[]args) {
		HashMap<Integer,String>name=new HashMap<Integer,String>();
		name.put(1, "vanmathi");
		name.put(2,"test2");
		name.put(3,"chennai");
		name.remove(2);
		System.out.println(name.get(1));
		System.out.println(name);
	}

}

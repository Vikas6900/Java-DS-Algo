package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

//		ArrayList<String> fruits = new ArrayList<String>();
		//List<String> fruits = new ArrayList<String>();   //both are correct.List is recomended as we can later change arraylist into linkedlist without changing any code.
		List<String> fruits = new LinkedList<String>();


		
		fruits.add("Apple");
		//fruits.add(23);
		
		System.out.println(fruits);
		
		Pair<String,Integer> p1 = new Pair<>("vikas",1);
		Pair<Boolean,String> p2 = new Pair<>(true,"hello");
		p1.getDescription();
		p2.getDescription();
		
		
	}

}

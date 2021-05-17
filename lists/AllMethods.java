package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllMethods {
	public static void main(String[] args) {
		List<String> fruits = new LinkedList<>();
		List<String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hii");
		fruits.add("Coffee");
		fruits.add("Banana");
		fruits.add("Hello");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Brinjal");
		
		fruits.addAll(vegetables);
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Hii");
		toRemove.add("Hello");
		toRemove.add("Coffee");
		
		fruits.set(8,"Carrot");  //replaces ele at index 8 i.e. Brinjal to carrot
		//fruits.remove(5);   // removes hello from the list and reduces the index
		fruits.removeAll(toRemove);
		//fruits.clear();
		
		String x[] = new String[fruits.size()];
		
		fruits.toArray(x);
		
		
		System.out.println(fruits.size());
		System.out.println(fruits);
		System.out.println(fruits.get(3));
		System.out.println(fruits.contains("Guava"));
		System.out.println(fruits.isEmpty());
		
		for(String e : x) {
			System.out.print(e + " ");
		}
		System.out.println();
		for(String e : fruits) {
			System.out.print(e + " ");
		}
	}

}

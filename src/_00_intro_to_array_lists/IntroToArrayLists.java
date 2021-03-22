package _00_intro_to_array_lists;
import java.util.*;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> thing = new ArrayList<String>();
		//2. Add five Strings to your list
		thing.add("thing1");
		thing.add("thing2");
		thing.add("thing3");
		thing.add("thing4");
		thing.add("thinge5");
		//3. Print all the Strings using a standard for-loop
		for(int y = 0; y<thing.size();y++) {
			System.out.println(thing.get(y));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String u:thing) {
			System.out.println(u);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int p = 0; p<thing.size();p+=2) {
			System.out.println(thing.get(p));
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = thing.size()-1;i>=0; i--) {
			System.out.println(thing.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int p = 0; p<thing.size();p++) {
		if(thing.get(p).contains("e")) {
			System.out.println(thing.get(p));
		}
		}
	}
		
}

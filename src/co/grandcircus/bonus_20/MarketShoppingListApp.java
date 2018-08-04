package co.grandcircus.bonus_20;
import java.util.*;

// Task: Bonus Exercise 20 - Make a shopping list application which uses collections to store your items.

public class MarketShoppingListApp {

	public static void main(String[] args) {
		String[] provisions = {"apple", "banana", "cauliflower", "eggplant", "headcheese", "kumquat", "oatmeal", "vinigar"};
		
		// casts the data
		List<String> list1 = new ArrayList<String>();
		
		// add array items to list
		for (String x: provisions)
			list1.add(x);
		
		String[] noPlantProvisions = {"vinigar", "headcheese"};
		List<String> list2 = new ArrayList<String>();
		
		// add array items to list
		for (String y: noPlantProvisions)
			list2.add(y);
		
		// print out list 1
		for (int i = 0;i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		//method
		editList (list1, list2);
		System.out.println();
		
		// print out list 1
		for (int i = 0;i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
	}
	
	public static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		
		while (it.hasNext()) {
			if (l2.contains(it.next()))
				it.remove();				
		}
	}
}


// Sources used to learn collections:
// 	Cave of Programming
// https://www.youtube.com/watch?v=mkCTxtLe7XU
// https://www.youtube.com/watch?v=YmDbL_fCEII
// 	thenewboston
// https://www.youtube.com/watch?v=jU5ACV5MucM
// https://www.youtube.com/watch?v=uoLgfgcB3XQ
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class collection{
	public static void main(String[] args){
		Random rand = new Random(); //random number generator for section 3
		Integer dupe = 0, i = 0;
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //create two empty lists. Lists used for the Collections.shuffle(List) method and for List.remove(index)
		list1.add(1); //add all integers from 1 to 10 inclusive
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list2.add(6); //add all integers from 6 to 15 inclusive
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		Collections.shuffle(list1);
		Collections.shuffle(list2); //shuffle both lists
		System.out.println("Shuffled collections:");
		System.out.println("Collection 1: "+list1);
		System.out.println("Collection 2: "+list2);
		System.out.println("Size of collection 1: "+list1.size());
		System.out.println("Size of collection 2: "+list2.size()); //print contents of each list and length of each list
		System.out.println(""+list1);
		System.out.println(""+list1);
		
		for(int n : list2){ //for each element in list2
			if(!list1.contains(n)){ //if list1 does not contain it already,
				list1.add(n); //add that element to list1
			}
		}
		Collections.sort(list1); //sort list1
		list1.remove((list1.size()-1)/2); //remove middle item in list. List is zero-indexed, half of an int is rounded down; this will remove middle element if odd number in list, lower of middle two if even number in list
		Collections.reverse(list1); //reverse order of list for printing
		System.out.println("Both sets combined, ordered, middle removed, reverse order:");
		System.out.println(""+list1);
		System.out.println(""+list1);
		System.out.println(""+list1);
		
		ArrayList<Integer> table = new ArrayList<Integer>(); //new set, used because arraylist indexes each entry, giving each value a key
		for(i = 1; i <= 5; i++){ //for ints 1 through 5, inclusive
			if(!table.contains(i)) {
				table.add(i);
				} //if set does not already contain the pair, add it
			else System.out.println("Duplicate Value/Key pair, pair not added: " + i +", "+ i); //else it contains the pair, do not add it and print key and value to console
		}
		dupe = 5; //set duplicate to last added value
		if(!table.contains(dupe)) {
			table.add(dupe);
		} //same duplicate check as above, using duplicate V/K pair
		else System.out.println("Duplicate Value/Key pair, pair not added: " + dupe +", "+ dupe);
		
		System.out.println("Final Value,Key pairs in collection:");
		i = 1;
		for(int n : table){ //for each K/V pair in set
			System.out.println(i +", "+ n); //print each key and value
			++i;
		}
		System.out.println("Final number of pairs in table: "+ table.size()); //print final number of entries in set
	}
}

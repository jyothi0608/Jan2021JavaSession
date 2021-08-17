package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
		//Create a list and add some colors to the list
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("Voilet");
		colorsList.add("Indigo");
		colorsList.add("Blue");
		colorsList.add("Green");
		colorsList.add("Yellow");
		colorsList.add("Orange");
		colorsList.add("Red");
		System.out.println(colorsList);
		//Insert a color in the first and last position of the list
		colorsList.add(0,"Pink");
		colorsList.add(8,"Purple");
		System.out.println(colorsList);
		// Retrieve the first and third element
		String element = colorsList.get(0);
		System.out.println("First element: "+element);
		element = colorsList.get(2);
		System.out.println("Third element: "+element);
		// Update the third element with "Yellow"
		colorsList.set(2, "White");
		System.out.println(colorsList);
		// Remove the third element from the list.
		colorsList.remove(2);
		System.out.println("After removing third element from the list:\n"+colorsList);
		// Search an element in a ArrayList
	    if(colorsList.contains("Voilet")){
	    System.out.println("Found the element");
	    }else{
	    System.out.println("There is no such element");
	    }
	    //Reverse elements in a ArrayList
	    System.out.println("List before reversing :\n" + colorsList);  
	    Collections.reverse(colorsList);
	    System.out.println("List after reversing :\n" + colorsList );
	    //Extract a portion of a ArrayList
	    System.out.println("Original list: " + colorsList);
	    List<String> subList = colorsList.subList(0, 3);
	    System.out.println("List of first three elements: " + subList);
	    //Swap two elements in an ArrayList
	    ArrayList<String> s= new ArrayList<String>();
        s.add("Green");
        s.add("Purple");
        s.add("Pink");
        s.add("Ash");
        s.add("White");
        System.out.println("Array list before Swap:");
        for(String a: s){
        System.out.println(a);
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(s, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: s){
        System.out.println(b);
        }
        //Empty an ArrayList
        System.out.println("Original array list: " + s);
        s.removeAll(s);
        System.out.println("After removing all the elements from the ArrayList "+ s);   
        //Trim the Virtual capacity of an ArrayList to the current list size
        ArrayList<String> s1= new ArrayList<String>();
        s1.add("Green");
        s1.add("Purple");
        s1.add("Pink");
        s1.add("Ash");
        s1.add("White");
        System.out.println("Original array list: " + s1);
        System.out.println("Lets trim the above array to the current list size: ");
        s1.trimToSize();
        System.out.println(s1);
        //Print all the elements of a ArrayList using the positions of the elements
        System.out.println("\nOriginal array list: " + s1);
        System.out.println("\nPrint the elements using Index: ");
        int no_of_elements = s1.size();
        for (int index = 0; index < no_of_elements; index++)
        System.out.println(s1.get(index));
	    }
	}

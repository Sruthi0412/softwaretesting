package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayAssignment {

	public static void main(String[] args) {
		List<String>s=new ArrayList<String>();
		 s.add("RED");
	     s.add("BLACK");
	     s.add("BLUE");
	     s.add("GREEN");
	     s.add("PINK");
	     s.add("YELLOW");
	System.out.println("Colors List: "+s);
	
	System.out.println("Element at index 5: "+s.get(5));
	
	Iterator<String>i=s.iterator();
	   
	while(i.hasNext()) {
		System.out.println("Iterating through list: "+i.next());
	}
	
	s.remove(2);
	System.out.println("After removing third element: "+s);
	
	System.out.println("Searching element in array: "+s.contains("BLACK"));

	}
}

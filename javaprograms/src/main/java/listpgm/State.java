package listpgm;

import java.util.LinkedList;
import java.util.List;

public class State {

	public static void main(String[] args) {
		List<Integer>i=new LinkedList<Integer>();
		
		     i.add(23);
		     i.add(43);
		     i.add(65);
		     i.add(25);
		     i.add(65);
		System.out.println(i);
		
	System.out.println(i.get(2));
	
	  i.set(1,32);
	  System.out.println(i);
	  
	  System.out.println(i.size());
	  System.out.println(i.isEmpty());
	  
	  i.remove(0);
	  System.out.println(i);
	  
	  System.out.println(i.contains(65));
	  
	  System.out.println(i.indexOf(65));
	  System.out.println(i.lastIndexOf(65));
	}

}

package listpgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMeth {

	public static void main(String[] args) {
		
		List<Integer>i=new LinkedList<Integer>();
		 i.add(23);
	     i.add(43);
	     i.add(65);
	     i.add(25);
	     i.add(65);
	System.out.println(i);
	Iterator<Integer>s=i.iterator();
	   
	while(s.hasNext()) {
		System.out.println(s.next());
	}
	s.remove();
	System.out.println(i);
	}

}

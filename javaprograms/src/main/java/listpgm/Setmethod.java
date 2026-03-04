package listpgm;

import java.util.HashSet;
import java.util.Set;

public class Setmethod {

	public static void main(String[] args) {
		Set<Integer>i=new HashSet<Integer>();
		Set<Integer>s=new HashSet<Integer>();
		
		 i.add(23);
	     i.add(43);
	     i.add(65);
	     i.add(25);
	     i.add(20);
	     
	     s.add(13);
	     s.add(33);
	     s.add(95);
	     s.add(4);
	     s.add(15);
	     System.out.println(i);
	     System.out.println(s);
	     
	s.addAll(i);
	System.out.println(s);

	System.out.println(s.size());
	System.out.println(s.isEmpty());
	
	System.out.println(s.contains(25));
	
	System.out.println(s.containsAll(i));
	
	s.remove(20);
	System.out.println(s);
	
	s.removeAll(i);
	System.out.println(s);
	
	s.clear();
	System.out.println(s);
	
	
	}

}

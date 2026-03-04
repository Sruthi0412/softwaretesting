package listpgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		
		List<String>s=new ArrayList<String>();
		 s.add("RED");
	     s.add("BLACK");
	     s.add("BLUE");
	     s.add("GREEN");
	     s.add("PINK");
	     s.add("YELLOW");
	System.out.println(s);

	   
	for(String p:s){
		System.out.println(p);
	}
	
}

}

package demo;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		StringBuffer s= new StringBuffer("hello ");
		s.reverse();
		System.out.println(s);
		s.append(" java");
		System.out.println(s);
		s.insert(2, "world");
		System.out.println(s);
		s.delete(1, 4);
		System.out.println(s);
		s.replace(0, 3, "hello");
		System.out.println(s);
	}

}

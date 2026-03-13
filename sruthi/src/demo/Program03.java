package demo;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		StringBuilder s= new StringBuilder("hello ");
		s.reverse();
		System.out.println(s);
		s.append(" java");
		System.out.println(s);
		s.insert(6, "world");
		System.out.println(s);
		s.delete(1, 4);
		System.out.println(s);
		s.replace(0, 3, "hello");
		System.out.println(s);
	}

}

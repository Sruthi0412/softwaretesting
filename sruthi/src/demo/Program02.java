package demo;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s= new StringBuffer("hello");
		s.reverse();
		System.out.println(s);
		
		StringBuffer s1= new StringBuffer("hello ");
		s1.append("java");
		System.out.println(s1);
		
		StringBuffer s2= new StringBuffer("hello");
		s2.insert(2,"world");
		System.out.println(s2);
		
		StringBuffer s3= new StringBuffer("hello");
		s3.delete(1,3);
		System.out.println(s3);
		
		StringBuffer s4= new StringBuffer("hello");
		s4.replace(1,3,"world");
		System.out.println(s4);
		
		}

}

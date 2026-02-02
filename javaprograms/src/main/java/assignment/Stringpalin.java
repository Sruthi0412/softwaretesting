package assignment;

public class Stringpalin {

	public void palindrome(String s) {
		String reverse = "";
		for(int i= s.length()-1;i>=0;i--) {
			reverse= reverse+s.charAt(i);
		}
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println(s+ " is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}
	}
	public static void main(String[] args) {
		
		Stringpalin s= new Stringpalin();
		s.palindrome("MALAYALAM");
		s.palindrome("JAVA");

	}

}

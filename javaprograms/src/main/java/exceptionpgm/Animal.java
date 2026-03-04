package exceptionpgm;

public class Animal {

	public static void main(String[] args) {
	try {
		int a[]= new int[3];
		a[3]=23/0;
	}
	catch(ArrayIndexOutOfBoundsException b) {
		System.out.println("Array exp");
	}

	catch(ArithmeticException a) {
	      System.out.println("Arithmetic exp");
		
	}
	
	}

}

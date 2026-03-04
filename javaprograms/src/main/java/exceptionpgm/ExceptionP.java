package exceptionpgm;

public class ExceptionP {

	public static void main(String[] args) {
		try {
			int num=10/0;
			System.out.println(num);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		
		finally {
			System.out.println("Program to try exception handling");
		}
	}

}

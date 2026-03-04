package exceptionpgm;

public class Vote {

	public static void main(String[] args) {
		int a=15;
		if(a>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new ArithmeticException("Not Eligible");
		}

	}

}

package assignment;

public class Divisibility extends Sum{
	
	public void divisible(int a, int b) {
		int sum= super.add(a,b);
		System.out.println("Sum="+ sum);
		if(sum%10==0) {
			System.out.println("Sum is divisible by 10");
		}
		else {
			System.out.println("Sum is not divisible by 10");
			
		}
	}

	public static void main(String[] args) {
		Divisibility d= new Divisibility();
		d.divisible(20, 40);

	}

}

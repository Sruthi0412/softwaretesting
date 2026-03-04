package assignment;

public class Offseason extends Onseason{

	public void discount(double amount) {
		super.discount(5000);
		
		double discount= amount*0.15;
		double payable=amount-discount;
		
		System.out.println("OFFSEASON");
		System.out.println("Original amount="+amount);
		System.out.println("Discount(15%)="+discount);
		System.out.println("Amount payable="+payable);
	}
	public static void main(String[] args) {
	      
		Offseason out= new Offseason();
		out.discount(4000);

	}

}

package assignment;

public class Onseason {
	public void discount(double amount) {
		
		double discount= amount*0.4;
		double payable=amount-discount;
		
		System.out.println("ONSEASON");
		System.out.println("Original amount="+amount);
		System.out.println("Discount(40%)="+discount);
		System.out.println("Amount payable="+payable);
	}

}

package assignment;

public class HDFC implements RBI {

	public static void main(String[] args) {
		System.out.println("Maturity amount");
	        HDFC out=new HDFC();
	        out.recurringDeposit(2000, 12);

	}

	@Override
	public void recurringDeposit(double amount, int period) {
		double RD=amount*period +(amount*period*interest);
		System.out.println(RD);
		
		
	}

}

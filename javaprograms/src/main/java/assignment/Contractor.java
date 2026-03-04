package assignment;

public class Contractor extends Employee1{
	
	int hours;
	public Contractor(double pay, int hours) {
		super(pay);
        this.hours=hours;
	}

	@Override
	public void calculateSalary() {
		System.out.println(pay*hours);
		
		
	}

}

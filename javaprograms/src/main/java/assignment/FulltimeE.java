package assignment;

public class FulltimeE extends Employee1{
	
	public FulltimeE(double pay) {
		super(pay);
	
	}

	public static void main(String[] args) {
		
		System.out.println("Fulltime Employee Salary");
	   FulltimeE out= new FulltimeE(800);
	   out.calculateSalary();
	  
	   System.out.println("Contract Employee Salary");
	   Contractor c=new Contractor(500, 8);
	   c.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		System.out.println(pay*8);
		
	}

}

package assignment;

public class Salaryslip extends Salary{
	
public void display() {

	super.calculate();
   double total= pay+(hra-pf-deduction+bonus);

      System.out.println("SALARY SLIP");
      System.out.println();
      System.out.println("Basic pay="+ pay);
      System.out.println("HRA(5%)="+ hra);
      System.out.println("PF(20%)="+ pf);
      System.out.println("Deduction="+ deduction);
      System.out.println("Bonus="+ bonus);
      
      System.out.println();
      
      System.out.println("Total salary="+ total);
        
}

	public static void main(String[] args) {
	       
		Salaryslip s= new Salaryslip();
		s.display();

	}

}

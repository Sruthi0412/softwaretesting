package assignment;

public class Salary extends Employee 
{
	double hra;
	double pf;
	
	public void calculate() {
		
		hra= 0.05*pay;
		pf= 0.2*pay;
	}

}

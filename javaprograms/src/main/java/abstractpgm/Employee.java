package abstractpgm;

public class Employee extends Manager{
	public void review() {
		System.out.println("Review message");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.review();
		e.appraisal();
		e.salary();
		

	}

	@Override
	public void appraisal() {
		System.out.println("Excellent");
		
	}

}

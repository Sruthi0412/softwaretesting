package superkey;

public class Employee extends Manager {
	public Employee() {
		
		super();
		System.out.println("Message from Employee class");
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();

	}

}

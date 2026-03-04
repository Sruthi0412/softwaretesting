package multipleinheritance;

public class Child implements Father, Mother{

	public static void main(String[] args) {
		Child c= new Child();
		c.features();
		c.height();
	

	}

	@Override
	public void features() {
		System.out.println("Excellent features");
		
	}

	@Override
	public void height() {
		System.out.println("180cm Tall");
		
	}

}

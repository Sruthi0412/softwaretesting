package superkey;

public class Animal extends Forest{

	public void fast() {
		
		super.fast();
		System.out.println("Animals are running");
	}
	public static void main(String[] args) {
		
		Animal a= new Animal();
		a.fast();

	}

}

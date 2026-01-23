package hierarchicalinheritance;

public class Daughter extends Father {
	public void dance() {
		System.out.println("Very good");
	}

	public static void main(String[] args) {
		
 
		Daughter d= new Daughter();
		d.height();
		d.dance();
	}

}

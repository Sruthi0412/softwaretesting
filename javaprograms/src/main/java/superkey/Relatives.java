package superkey;

public class Relatives extends Family {
	int x=200;
	public void display() {
		System.out.println(x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		Relatives r= new Relatives();
		r.display();
		r.show();

	}

}

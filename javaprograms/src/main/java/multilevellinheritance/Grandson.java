package multilevellinheritance;

public class Grandson extends Mother{
	public void number() {
		System.out.println("95");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grandson g= new Grandson();
		g.number();
		g.dance();
		g.height();
	}

}

package protectedaccess;

public class Places {
	protected void height() {
		System.out.println("Tall");
	}

	public static void main(String[] args) {
		
		Places p= new Places();
		p.height();

	}

}

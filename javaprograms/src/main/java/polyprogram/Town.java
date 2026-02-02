package polyprogram;

public class Town extends City{
	public void climate() {
		super.climate();
		System.out.println("Autumn");
	}

	public static void main(String[] args) {
		Town t= new Town();
		t.climate();
		
		City c=new Town();
		c.climate();

	}

}

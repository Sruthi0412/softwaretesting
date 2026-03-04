package interfacepgm;

public class Device implements Mobile {
	public void show() {
		System.out.println("Display features");
	}

	public static void main(String[] args) {
		Device d= new Device();
		d.show();
		d.performance();

	}

	@Override
	public void performance() {
		System.out.println("Interface message");
		
	}

}

package polyprogram;

public class State {
	public void add(int a,int b) {
		int s=a+b;
		System.out.println(s);
	}
	
	public void add() {
		System.out.println("Addition");
	
	}
 
	public void add(int a, int b, int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		State t= new State();
		t.add();
		t.add(30,15,45);
		t.add(67,84);

	}

}

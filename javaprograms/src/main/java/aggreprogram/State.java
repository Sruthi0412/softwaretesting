package aggreprogram;

public class State {
	
	int c;
	int d;
	City t;
	
	public State(int c,int d,City t) {
		this.c=c;
		this.d=d;
		this.t=t;
	}
	
	public void print() {
		System.out.println(c);
		System.out.println(d);
		System.out.println(t.a);
		System.out.println(t.b);
	}

	public static void main(String[] args) {
		City y= new City();
		y.climate(20, 30);
		State s= new State(15,45,y);
		s.print();
		

	}

}

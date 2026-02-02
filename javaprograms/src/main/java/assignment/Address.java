package assignment;

public class Address {
	String a;
	Student p;
	
public Address(String a,Student p) {
	this.a=a;
	this.p=p;
}
public void display() {
	System.out.println("Name of Student= "+ p.n);
	System.out.println("Roll Number ="+ p.r);
	System.out.println("Address: "+ a);
	
}

	public static void main(String[] args) {
		Student z= new Student();
		z.details("Sruthi", 10);
		Address out= new Address("Trivandrum,Kerala",z);
		out.display();

	}

}

package assignment;

public class Bank {
	private int p;
	
public void setpin(int p) {
	this.p=p;
}

public boolean validate() {
	return(p==1001|| p==1234|| p==1212);
}
public void getpin(int amount) {
	if(validate()) {
		System.out.println("Pin validation successfull");
		System.out.println("Amount withdrawn="+amount);
	}
	else {
		System.out.println("Invalid pin! Transaction failed");
	}
}
}

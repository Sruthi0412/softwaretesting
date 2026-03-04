package exceptionpgm;

public class ThrowsPgm {

	public static void main(String[] args) throws VotingException {
		int a=15;
		if(a>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new VotingException("Not Eligible");
		}

	}

}

package demo;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="java";
       System.out.println(s.length());
       
       String s1="meaning";
       String s2="Meaning";
       String s3="meaning";
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
       
       String a5 ="meaning";
       String a6 ="Meaning";
       String a7 ="meaning";
       System.out.println(a5.equalsIgnoreCase(a6));
       System.out.println(a5.equalsIgnoreCase(a7));
       
       String s4="sruthi";
       System.out.println(s4.toUpperCase());
       
       String s5="SRUTHI";
       System.out.println(s5.toLowerCase());
       
       String a1="Demand";
       System.out.println(a1.charAt(4));
       
       int v = 250;
       System.out.println(String.valueOf(v));
       
       String s6="Netflix";
       System.out.println(s6.startsWith("ne"));
       System.out.println(s6.startsWith("Ne"));
       
       String a2="software";
       System.out.println(a2.endsWith("re"));
	}

}

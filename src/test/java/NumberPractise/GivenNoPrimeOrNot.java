package NumberPractise;

public class GivenNoPrimeOrNot {

	public static void main(String[] args) {
	    int n=5;
	    for(int i=2;i<n/2;i++)
	    {
	    	if(n%i==0)
	    		System.out.println("The given no is not prime");
	    }
	    System.out.println("The given number is prime");

	}

}

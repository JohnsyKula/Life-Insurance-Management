package NumberPractise;

public class PrimeInGivenArray {

	public static void main(String[] args) {
		int[] a= {1,3,2,4,6,5,9,7};
		for(int i=0;i<a.length;i++)
		{
		  boolean rs = isPrime(a[i]);
		  if(rs==true)
		  {
			  if(a[i]==1)
			  {
				  
			  }
			  else
			  {
				  System.out.print(a[i]+" ");
			  }
		  }
		}
		

	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}

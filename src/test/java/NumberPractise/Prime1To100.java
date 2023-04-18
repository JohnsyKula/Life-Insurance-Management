package NumberPractise;

public class Prime1To100 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			boolean rs = isPrime(i);
			if(rs==true)
			{
				count++;
				if(i==1)
				{
					
				}
				else
				{
				System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	    System.out.println(count);
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

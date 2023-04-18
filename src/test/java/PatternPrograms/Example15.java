package PatternPrograms;

public class Example15 {
	public static void main(String[] args)
	{
//	int n=5;
//	char ch='A';
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n;j++)
//		{
//			System.out.print(ch++ +" ");
//		}
//		System.out.println();
//	}
		
		
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(64+k) +" ");
				k++;
			}
			System.out.println();
		}
	}

}

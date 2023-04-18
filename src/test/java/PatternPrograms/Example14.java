package PatternPrograms;

//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 

public class Example14 {
	public static void main(String[] args)
	{
	
//----->1 st way		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print((char)(64+j)+" ");
//			}
//			System.out.println();
//		}
	
//---------->2nd way
		int n=5;
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
		
		
	}

}

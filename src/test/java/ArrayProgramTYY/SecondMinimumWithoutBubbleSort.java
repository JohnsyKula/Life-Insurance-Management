package ArrayProgramTYY;

public class SecondMinimumWithoutBubbleSort {

	public static void main(String[] args) {
	int a[]= {3,5,8,0,7};
	int fmin=a[0];
	int smin=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<=fmin)
		{
			if(a[i]!=fmin)
			{
				smin=fmin;
			}
		   fmin=a[i];
		}
		else if(fmin==smin||a[i]<smin)
		{
			smin=a[i];
		}
	}
	System.out.println(fmin);
	System.out.println(smin);

	}

}

package ArrayProgramTYY;

public class FirstMinWithoutUsingBubblesort {

	public static void main(String[] args) {
		int a[]= {5,4,0,1,3};
		int fmin=a[0];
		for(int i=0;i<a.length;i++)
		{
          if(a[i]<fmin)
          {
        	  fmin=a[i];
          }
		}

		System.out.println(fmin);
	}
}

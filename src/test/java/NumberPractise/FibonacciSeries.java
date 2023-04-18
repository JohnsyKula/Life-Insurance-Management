package NumberPractise;

public class FibonacciSeries {

	public static void main(String[] args) {
       int n1=0,n2=1,sum=0,count=0;
       System.out.print(n1+" "+n2+" ");
       for(int i=1;i<20;i++)
       {
          sum=n1+n2;
          System.out.print(sum+" ");
          count++;
          n1=n2;
          n2=sum;
          if(sum==34)
          {
        	  break;
          }
       }

	}

}

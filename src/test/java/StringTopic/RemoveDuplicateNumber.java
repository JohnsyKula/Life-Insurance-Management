package StringTopic;

import java.util.HashSet;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		
	 //1.removing duplicates
//      int[] a= {4,5,4,1,5,3,2};
//      HashSet<Integer> hs=new HashSet<Integer>();
//      for(int i=0;i<a.length;i++)
//      {
//    	  hs.add(a[i]);
//      }
//      System.out.println(hs);
		
      
      //2.count Duplicates
//      int[] a= {4,5,4,1,5,3,2};
//      HashSet<Integer> hs=new HashSet<Integer>();
//      for(int i=0;i<a.length;i++)
//      {
//    	  hs.add(a[i]);
//      }
//      for(Integer n:hs)
//      {
//    	    int count=0;
//    	    for(int i=0;i<a.length;i++)
//    	    {
//    	    	if(n==a[i])
//    	    		count++;
//    	    }
//	    	
//	    	if(count>1)
//	    	 System.out.println(n+"is present in "+count+" times");
//      }
		
		
		//3.Print position without duplicates
//      int[] a= {4,5,4,1,5,3,2};
//      HashSet<Integer> hs=new HashSet<Integer>();
//      for(int i=0;i<a.length;i++)
//      {
//    	  hs.add(a[i]);
//      }
//      for(Integer n:hs)
//      {
//    	    int count=0;
//    	    for(int i=0;i<a.length;i++)
//    	    {
//    	    	if(n==a[i])
//    	    	{
//    	    		System.out.println(n+"is present in "+(i+1)+" position");
//    	    		break;
//    	    	}	
//    	    }
//      }
		
		
		//4.print position in reverse without duplicates
//	      int[] a= {4,5,4,1,5,3,2};
//	      HashSet<Integer> hs=new HashSet<Integer>();
//	      for(int i=0;i<a.length;i++)
//	      {
//	    	  hs.add(a[i]);
//	      }
//	      for(Integer n:hs)
//	      {
//	    	    int count=0;
//	    	    for(int i=a.length-1;i>=0;i--)
//	    	    {
//	    	    	if(n==a[i])
//	    	    	{
//	    	    		System.out.println(n+"is present in "+(i+1)+" position");
//	    	    		break;
//	    	    	}	
//	    	    }
//	      }
	      
	      
	      //5.count of unique number
	      int[] a= {4,5,4,1,5,3,2};
	      HashSet<Integer> hs=new HashSet<Integer>();
	      for(int i=0;i<a.length;i++)
	      {
	    	  hs.add(a[i]);
	      }
	      for(Integer n:hs)
	      {
	    	    int count=0;
	    	    for(int i=0;i<=a.length-1;i++)
	    	    {
	    	    	if(n==a[i])
	    	    	{
                        count++;
	    	    	}	
	    	    }
	    	    if(count==1)
	    	    {
	    	    	System.out.println(n+"----->"+count);
	    	    }
	      }  
	}
}

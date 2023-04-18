package StringTopic;

public class ReverseString {

	public static void main(String[] args) {
     //------>1.normal way		
//	    String s="Software";
//	    for(int i=s.length()-1;i>=0;i--)
//	    {
//	    	System.out.print(s.charAt(i));
//	    }
		
		//------->2.using 3rd  variable
//		String s="Software";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		
		//-------->3.using toCharArray
//		String s="Software";
//		char[] ch=s.toCharArray();
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		//------->4.Using varcount
//		String s="Software";
//		char[] str=s.toCharArray();
//		int count=0;
//		for(char c:str)
//		{
//			count++;
//		}
//		
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.print(str[i]);
//		}
		
		
		//------->5.Using String builder class
		String s="software";
		StringBuilder str=new StringBuilder(s);
		System.out.println(str.reverse());
	}

}

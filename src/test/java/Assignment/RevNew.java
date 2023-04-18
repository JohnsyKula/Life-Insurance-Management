package Assignment;

public class RevNew {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		System.out.println(rev);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}

}

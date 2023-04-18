package StringTopic;

import java.util.HashSet;

//incomplete

public class CountOfVowelsWithoutDuplicates {

	public static void main(String[] args) {
		  String s="Engineer";
		  String s1=s.toLowerCase();
		  char[] c=s1.toCharArray();
		  HashSet<Character> hs=new HashSet<Character>();
		  for(int i=0;i<c.length;i++)
		  {
			  if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			  {
                   hs.add(c[i]);
			  }
		  }
         for(Character ch:hs)
         {
        	 int count=0;
        	 for(int i=0;i<c.length;i++)
        	 {
        		 if(ch==c[i])
        		 {
        			 count++;
        		 }
        	 }
        	 if(count==1)
        		 System.out.println(ch);
         }

	}

}

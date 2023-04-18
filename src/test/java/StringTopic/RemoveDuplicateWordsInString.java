package StringTopic;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
//  String s="I am I am a software a engineer";
//  String[] st=s.split(" ");
//  LinkedHashSet<String> ls=new LinkedHashSet<String>();
//  for(int i=0;i<st.length;i++)
//  {
//	  ls.add(st[i]);
//  }
//  for(String i:ls)
//  {
//	  System.out.print(i+" ");
//  }
		
		//count of duplicate words
		String s="I am I am a software a engineer";
		String[] st=s.split(" ");
		LinkedHashSet <String> set=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(word.equals(st[i]))
				{
					count++;
				}
			}
			if(count>1)
          System.out.println(word+" is present in "+count+" times");
		}	
	}
}

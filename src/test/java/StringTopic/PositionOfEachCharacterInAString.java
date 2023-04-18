package StringTopic;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterInAString {
	public static void main(String[] args) {
		String st="Kannada";
		String s=st.toLowerCase();
	    LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			System.out.println(s.charAt(i)+" is present in "+(i+1)+" position");
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(ch+" is repeating "+count+" times");

		}
	}

}

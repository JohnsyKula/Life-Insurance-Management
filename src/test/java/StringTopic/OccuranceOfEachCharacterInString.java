package StringTopic;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		{
			String st="Kannada";
			String s=st.toLowerCase();
			LinkedHashSet <Character> set=new LinkedHashSet<Character>();
			for(int i=0;i<s.length();i++)
			{
				set.add(s.charAt(i));
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
				System.out.println(ch+" is repeating "+count+" times");
			}
		}
	}

}

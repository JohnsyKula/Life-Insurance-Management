package StringTopic;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterInAStringWithoutDuplicates {

	public static void main(String[] args) {
		String st="Kannada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}
}

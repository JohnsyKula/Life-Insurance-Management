package StringTopic;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterInAString {

	public static void main(String[] args) {
	String st="Kannada";
	String s=st.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character i:set)
	{
		System.out.print(i);
	}
	}

}

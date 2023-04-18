package Assignment;

import java.util.LinkedHashSet;

public class CountChar {

	public static void main(String[] args) {
		String s="aaabbcdddf";
		char[] a=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(ch==a[i])
				{
					count++;
				}
			}
			if(count>1)
				System.out.print(ch+""+count);
			else
				System.out.print(ch);
		}

	}

}

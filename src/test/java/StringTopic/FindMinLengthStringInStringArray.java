package StringTopic;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinLengthStringInStringArray {

	public static void main(String[] args) {
		{
			String[] s= {"abc","abcdd","abcd","ab","dc"};
			String minlength=s[0];
			for(int i=0;i<s.length;i++)
			{
                if(minlength.length() > s[i].length())
                {
                	minlength=s[i];
                }
			    
			}
			for(int i=0;i<s.length;i++)
			{
				if(minlength.length()==s[i].length())
				{
					System.out.println(s[i]+" ");
				}
			}
		}

	}

}

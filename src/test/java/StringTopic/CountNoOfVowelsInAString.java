package StringTopic;

public class CountNoOfVowelsInAString {

	public static void main(String[] args) {
	  String s="Engineer";
	  String s1=s.toLowerCase();
	  char[] c=s1.toCharArray();
	  int count=0;
	  for(int i=0;i<c.length;i++)
	  {
		  if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		  {
			  count++;
			  System.out.print(c[i]+" ");
		  }
	  }
	  System.out.println();
	  System.out.println("Total number of vowels "+count);

	}

}

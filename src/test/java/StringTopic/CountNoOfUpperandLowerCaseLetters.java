package StringTopic;

public class CountNoOfUpperandLowerCaseLetters {

	public static void main(String[] args) {
    String s="SofTwArE";
    int uppercase=0;
    int lowercase=0;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)>='a'&&s.charAt(i)<='z')
    		lowercase++;
    	else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
    		uppercase++;
    }
    System.out.println("Count of uppercase "+uppercase);
    System.out.println("Count of lowercase "+lowercase);

	}

}

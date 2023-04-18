package StringTopic;

public class RemoveTheSpaceInaString {

	public static void main(String[] args) {
		String s="I am a Software Engineer";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]);
		}

	}

}

package StringTopic;

public class Swap1stAndLastWordInAString {

	public static void main(String[] args) {
		String s="I am a Software Engineer";
		String[] st=s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}


	}

}

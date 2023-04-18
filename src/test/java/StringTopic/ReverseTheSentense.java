package StringTopic;

public class ReverseTheSentense {

	public static void main(String[] args) {
		String sen="I am A Software Engineer";
		String[] sp=sen.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.println(sp[i]+" ");
		}

	}

}

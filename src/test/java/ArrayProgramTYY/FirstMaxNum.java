package ArrayProgramTYY;

public class FirstMaxNum {

	public static void main(String[] args) {
		int a[]= {5,3,0,1,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//int k = a.length-1;
		System.out.print("First maximum number is  "+a[a.length-1]);

	}

}

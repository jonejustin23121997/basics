package Arrays;

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		System.out.println("muliply element at odd index by 7 and even by 9 :");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println( "odd index "+ a[i]*7);
			}
			else
			{
				System.out.println("even index "+ a[i]*9);
			}
		}


	}

}

package Arrays;

public class program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,4,5,12,1,9,7,4};
		System.out.println("first and last elements in an array :");
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				System.out.println(a[i]);
			}
			if(i==a.length-1)
			{
				System.out.println(a[i]);
			}
		}

	}

}

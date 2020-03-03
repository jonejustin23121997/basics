package Arrays;

public class program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		int sum=0;
		System.out.println("sum of element at even index :");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
		}System.out.println(sum);


	}

}

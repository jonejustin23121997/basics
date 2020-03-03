package Arrays;

public class program34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={6,8,5,14,1,9,7,4};
		int max=a[0];
		
		System.out.println("maximum element in an array :");
		for(int i=0;i<a.length;i++)
		{
		if(max<a[i])
		{
			max=a[i];
			
		}
			
		}System.out.println(max);
		

	}

}

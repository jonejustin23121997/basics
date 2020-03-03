package Arrays;

public class program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("minimum element in array :");
		
			int a[]={6,8,5,14,1,9,7,4};
		int min=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
		if(min>a[i])
		{
			min=a[i];
			
		}
			
		}System.out.println(min);
			
		

	}

}

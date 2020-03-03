package Arrays;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,2,5,6,5,8};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
			 a[j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			
			{
			System.out.println(a[i]);
		}
		
		}
			
		
	}



	

}

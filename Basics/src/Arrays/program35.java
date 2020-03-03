package Arrays;

public class program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,4,-5,12,1,9,7,4};
		boolean flag=false;
		System.out.println("negative numbers in array :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				flag=true;
				
			}
		}System.out.println(flag);

	}

}

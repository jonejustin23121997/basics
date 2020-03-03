package Arrays;

public class program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		int temp=a[0];
	
		System.out.println("single rotation in an array :");
		for(int i=0;i<a.length-1;i++)
		{
		a[i]=a[i+1];
					
			}
			a[a.length-1]=temp;

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}

package Arrays;

public class program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		int search_element=4;
		int replacement=8;
		System.out.println("replace element :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
			a[i]=replacement;
			
			}
			System.out.println(a[i]);
		}


	}

}

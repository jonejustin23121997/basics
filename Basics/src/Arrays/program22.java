package Arrays;

public class program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		int search_elements=6;
		int count=0;
		System.out.println("count of search element :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_elements)
			{
			count=count+1;
			System.out.println(count);
			}
		}

		

	}

}

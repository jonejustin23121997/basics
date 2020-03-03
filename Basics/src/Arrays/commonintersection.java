package Arrays;

public class commonintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,3,4,6};
		int b[]={7,9,6};
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					
				{
					System.out.println(a[i]);
				}
				}
			}

	}

}

package Arrays;

public class ascendingorderforchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]={'a','c','b','B','D','A'};
		char temp=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					 a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println((char)a[i]);
		}
	}

}

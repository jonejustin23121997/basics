package Arrays;

public class program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("convert small to capital and capital to small :");
		char a[]={'a','A','i','B','u'};
		 
				for(int i=0;i<a.length;i++)
		{
			if(a[i]>95&&a[i]<123)
			{
			a[i]=(char)(a[i]-32);
			}
			else
			{
				a[i]=(char)(a[i]+32);
			}
		System.out.println(a[i]);
		



	}

}}

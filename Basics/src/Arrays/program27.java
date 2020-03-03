package Arrays;

public class program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("count  of e :");
		char a[]={'a','e','i','o','u'};
		 int count =0;
		char search_element='e';
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
			count=count+1;
			}
		}System.out.println(count);
		

	}

}

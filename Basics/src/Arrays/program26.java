package Arrays;

public class program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("repalce a by A :");
		char a[]={'a','e','i','o','u'};
		char search_element='a';
		char replacement='A';
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
			a[i]=replacement;
			}System.out.println(a[i]);
		}
		

	}

}

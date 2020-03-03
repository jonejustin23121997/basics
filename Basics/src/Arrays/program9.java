package Arrays;

public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,4,14,12,1,9,7};
		int count=0;
		
		System.out.println("count of odd numbers in array");
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2!=0)
		{
			count=count+1;
		}
		}System.out.println(count);

	}

}

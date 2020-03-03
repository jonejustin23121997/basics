
package Arrays;

public class mergingofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int b[]={4,5,6,7};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int temp=0;
		for(int i=a.length;i<c.length;i++)
		{
			c[i]=b[temp];
			temp=temp+1;			
			}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}


	}



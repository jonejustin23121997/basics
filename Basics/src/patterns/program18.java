package patterns;

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;int m=5;int x=2;int y=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1)
			{
		System.out.print(j+" ");
		
			}
			 else if (i==5)
			{
			System.out.print(m+" ");
			m--;
			}
			 else if(j==1)
			 {
				 System.out.print(x+" ");
				 x++;
			 }
			 else if (j==5)
			 {
				 System.out.print(y+" ");
				 y--;
			 }
			 else
			 {
				 System.out.print("  ");
			 }

		}System.out.println();

		}

	}}

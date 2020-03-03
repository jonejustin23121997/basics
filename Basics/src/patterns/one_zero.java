package patterns;

public class one_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; int m=1;int x=2;int y=3;int z=1;int g=4;int h=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print(1+" ");
				}
				else if(i==x&&j==m)
				{
					System.out.print("0 ");
					m++;
					x++;
				}
				else if (i==y&&j==z)
				{
					System.out.print("1 ");
					y++;
					z++;
				}
				else if(i==g&&j==h)
				{
					System.out.print("0 ");
					g++;
					h++;
				}
				else if(i==n&&j==1)
				{
					System.out.print("1 ");
				}
				else{
					System.out.print("  ");
				}
			}System.out.println( );
		}

	}

}

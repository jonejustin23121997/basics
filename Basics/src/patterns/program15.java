package patterns;

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1||i==5||j==1||j==5||j==3||i==3)
			{
			System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}			
			}
			System.out.println();

	}

	}

}

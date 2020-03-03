package patterns;

public class program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;		
		int b=n*2-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=b;j++)
			{
				if(i==j||j==b)
				{
					System.out.print("* ");
				}

				else
				{				System.out.print("  ");
				}			
			}
			System.out.println();

			b=b-1;



		}


	}

}

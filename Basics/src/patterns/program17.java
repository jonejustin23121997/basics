package patterns;

public class program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
				//no space right angle triangle
				//single space triangle
				//double space left angle triangle
				
				
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			
			
		System.out.println();
		}

		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
				//no space right angle triangle
				//single space triangle
				//double space left angle triangle
				
				
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			
			
		System.out.println();
		}
		for(int i=1;i<=2;i++)
		{
					for(int j=1;j<=5;j++)
						
						
					{
					
					if(j==2||j==4)
					{
						
							System.out.print("* ");
					}			
					else{
						System.out.print(" ");
					}
						}
					System.out.println();
			
		}

	}
}
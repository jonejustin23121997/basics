package patterns;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;int num=1;
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
				System.out.print(num +" ");
				num++;
			}


			System.out.println();
		}
		
	}

}



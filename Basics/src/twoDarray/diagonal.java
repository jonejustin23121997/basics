package twoDarray;

public class diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					c[i][j]=1;
					
					
				}System.out.print(c[i][j]+" ");
				/*else
				{
					System.out.print(a[i][j]+" ");	
				}*/
				
			}System.out.println();
			
		}
		


	}

}

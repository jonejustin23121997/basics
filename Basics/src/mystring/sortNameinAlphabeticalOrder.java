package mystring;

public class sortNameinAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jonejustin";
		char temp=0;
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			
		}
		for(int i=0;i<c.length;i++)
		{
			for (int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					 c[j]=temp;
				}
			}
		
				System.out.println((char)c[i]);
		}
				
		


	}

}

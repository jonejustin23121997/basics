package mystring;

public class CapsSmallviceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			if(i%2==0)
			{
				if(c[i]>95&&c[i]<123)
				{
				c[i]=(char)(c[i]-32);
				}
				else
				{			
					c[i]=(char)(c[i]+32);
				}
			}System.out.println(c[i]);
			
		}


	}

}

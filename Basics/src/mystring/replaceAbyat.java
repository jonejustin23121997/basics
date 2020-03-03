package mystring;

public class replaceAbyat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			
		if( c[i]=='a')
		{				
				System.out.println('@');
			}
		else
		{
			System.out.println(c[i]);
		}
		
		}

	}

}

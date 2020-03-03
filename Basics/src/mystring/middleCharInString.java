package mystring;

public class middleCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
			if(s.length()%2==0)
			{
				System.out.println(c[s.length()/2]);
				System.out.println(c[s.length()/2-1]);
			}
			else
			{
				System.out.println(c[s.length()/2]);
			}
			
		


	}

}

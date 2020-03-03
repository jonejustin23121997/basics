package mystring;

public class stringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			System.out.println(c[i]);
		}
				
		

		

	}

}

package mystring;

public class searchCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==('a'))
			{
				flag=true;
			}
			
		}System.out.println(flag);
		


	}

}

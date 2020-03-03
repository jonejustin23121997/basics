package mystring;

public class searchAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==('a'))
			{
				
				count=count+1;
			}
			
		}System.out.println(count);
		


	}

}

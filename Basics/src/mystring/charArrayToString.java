package mystring;

public class charArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[]={'a','e','i','o','u',};
		String s="";
		for(int i=0;i<c.length;i++)
		{
			s=s+c[i];
		}System.out.println(s);
		
	}

}
